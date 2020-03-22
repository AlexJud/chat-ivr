package com.net.asterisk.actions;

import com.net.common.graph.nodes.Node;
import com.net.common.graph.nodes.SayAndListenNode;
import com.net.common.graph.nodes.SayNode;
import com.net.dialog.models.commands.Executable;
import com.net.dialog.models.commands.VoiceAction;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.asteriskjava.fastagi.AgiChannel;
import org.springframework.stereotype.Component;

public class AsteriskActions implements VoiceAction {

    private AgiChannel agiChannel;

//    ? is Agichannel not Null?
    public AsteriskActions(AgiChannel agiChannel) {
        this.agiChannel = agiChannel;
    }


    @Override
    public Executable build(Node node) {
        switch (node.getClass().getSimpleName()) {
            case "SayNode":
                return new SayAction((SayNode) node,agiChannel);
            case "SayAndListenNode":
                return new SayAndListenAction((SayAndListenNode) node, agiChannel);
        }
        return null;
    }
}
