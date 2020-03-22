package com.net.dialog.service;

import com.net.common.asterisk.ExtraNode;
import com.net.common.graph.nodes.Filter;
import com.net.common.graph.nodes.Node;
import com.net.common.graph.nodes.SayNode;
import com.net.dialog.models.commands.Executable;
import com.net.dialog.models.commands.SayCommand;
import com.net.dialog.models.commands.VoiceAction;

public class GraphActionsFactory {

    private VoiceAction voiceAction;

    public GraphActionsFactory(VoiceAction voiceAction) {
        this.voiceAction = voiceAction;
    }

    public Executable buildCommand(Node node) {

        if (node instanceof ExtraNode){
           return voiceAction.build(node);
        } else {
//            todo factory Action nodes
            System.out.println("Builder not implemented");
            return null;
        }

    }
}
