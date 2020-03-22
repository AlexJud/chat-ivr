package com.net.asterisk.actions;

import com.net.common.graph.nodes.Node;
import com.net.common.graph.nodes.SayNode;
import com.net.dialog.models.Context;
import com.net.dialog.models.commands.Executable;
import com.net.dialog.service.SwapVars;
import org.asteriskjava.fastagi.AgiChannel;
import org.asteriskjava.fastagi.AgiException;

public class SayAction implements Executable {

    private SayNode node;
    private AgiChannel channel;

    public SayAction(SayNode node, AgiChannel channel) {
        this.node = node;
        this.channel = channel;
    }

    @Override
    public String execute(Context context) {

        if (!node.getSpeech().isEmpty()){
//            todo swap vars
            String phrase = SwapVars.seekVars(node.getSpeech(), null);

            try {
                channel.exec("command", "text + phrase");
            } catch (AgiException e) {
                e.printStackTrace();
            }
        }
        return "";
    }
}
