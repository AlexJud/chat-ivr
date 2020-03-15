package com.net.dialog;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.net.common.asterisk.Session;
import com.net.dialog.models.Context;
import com.net.dialog.models.commands.Executable;
import com.net.dialog.service.CommandFactory;
import com.net.dialog.service.ReadGraph;
import org.asteriskjava.fastagi.AgiChannel;
import org.springframework.stereotype.Service;

@Service
public class DialogLogic implements Dialog {


    @Override
    public String run(AgiChannel channel, Session session) {

        Context context = null;
//        parse json to scheme and create pool? Nodes
        try {
            context = ReadGraph.parseJson("asf");
        } catch (JsonProcessingException e) {
            e.printStackTrace();

        }
        if (context == null) {
            return "error";
        }


//        execute Node operation -> result
        String result = null;
//        Long currentNodeId = 0L;
        while (context.getCurrentNode() != null) {

//            result = ProcessFactory.build(context.getRootNode())
            Executable command = CommandFactory.buildCommand(context.getCurrentNode());
            result = command.execute(channel, context, context.getCurrentNode());



//        resolve result and navigate to next node

//            Router.navigateBy(result);


//            currentNodeId = null;
        }

        return null;
    }


}
