package com.net.dialog;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.net.common.asterisk.Session;
import com.net.common.graph.nodes.Node;
import com.net.dialog.converters.Converter;
import com.net.dialog.converters.SwapVariables;
import com.net.dialog.models.Context;
import com.net.dialog.models.commands.Executable;
import com.net.dialog.models.commands.VoiceAction;
import com.net.dialog.service.GraphActionsFactory;
import com.net.dialog.service.ReadGraph;
import com.net.dialog.service.Router;

import java.util.ArrayList;
import java.util.List;

public class GraphLogicImp implements DataNavigate {

    private Session session;
    private Context context;
    private VoiceAction asterisk;
    private GraphActionsFactory factory;
    private List<Converter> converterList = new ArrayList<>();


    public GraphLogicImp(Session session, VoiceAction asteriskActions) {
        this.session = session;
        this.asterisk = asteriskActions;
        this.factory = new GraphActionsFactory(asteriskActions);


        try {
//            todo read json and parse to Node[]
            context = ReadGraph.parseJson(session.getScenario().getJson());
        } catch (JsonProcessingException e) {
//            todo handle parsing
            e.printStackTrace();
        }
        this.converterList.add(new SwapVariables(this.context));
    }

    @Override
    public boolean runProcess() {

        String result;
//        todo check currentNotNull
        while (context.getCurrentNode() != null) {

//        todo make transformation with node? swapVars
            converterList.forEach(el -> {
               if (el.isInstanceOf(context.getCurrentNode())){
                   el.transform(context.getCurrentNode());
               }
            });

//        todo Factory.build action
            Executable command = factory.buildCommand(context.getCurrentNode());


//        todo getResult from execute  - sayandlisten -> return and back
            result = command.execute(context);

//        todo route to next node
            result = Router.navigate(result, context);
//            todo handle error find next

        }

        return true;

    }


}
