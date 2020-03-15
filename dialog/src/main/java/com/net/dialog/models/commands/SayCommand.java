package com.net.dialog.models.commands;

import com.net.common.graph.nodes.Node;
import com.net.common.graph.nodes.SayNode;
import com.net.dialog.models.Context;
import com.net.dialog.service.SwapVars;
import org.asteriskjava.fastagi.AgiChannel;
import org.asteriskjava.fastagi.AgiException;

public class SayCommand implements Executable {

    @Override
    public String execute(AgiChannel channel, Context context, Node node) {

        SayNode sayNode = (SayNode) node;
        if (!sayNode.getSpeech().isEmpty()) {
            String s = SwapVars.seekVars(sayNode.getSpeech(), context);
//            channel.exec(commands.speak(), textWithVars, node.getGrammar() + ", "+node.getAsrOptions());
            try {
                channel.exec("spear", s, "" + ", ASR Options");
            } catch (AgiException e) {
                e.printStackTrace();
            }
        }

//        if (!node.getSynthText().isEmpty()) {
//            try {
//                String textWithVars = Utils.replaceVar(node.getSynthText(), graph.getVariableMap());
//
////                asterisk.getSocket().sendServerMessage(textWithVars);
//                asterisk.getSocket().sendMessage(textWithVars, MessageType.SERVER,asterisk.getVariable("EXTEN"));
//                asterisk.exec(commands.speak(), textWithVars, node.getGrammar() + ", "+node.getAsrOptions());
//            } catch (AgiException e) {
//                e.printStackTrace();
//                return false;
//            }
//            return true;
//        }

        return null;
    }
}
