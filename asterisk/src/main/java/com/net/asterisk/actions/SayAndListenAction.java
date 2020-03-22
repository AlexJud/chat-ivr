package com.net.asterisk.actions;

import com.net.common.graph.nodes.Node;
import com.net.common.graph.nodes.SayAndListenNode;
import com.net.common.graph.nodes.SayNode;
import com.net.dialog.models.Context;
import com.net.dialog.models.commands.Executable;
import com.net.dialog.service.SwapVars;
import org.asteriskjava.fastagi.AgiChannel;
import org.asteriskjava.fastagi.AgiException;

public class SayAndListenAction implements Executable {

    // FIXME: 21.03.2020
    private SayAndListenNode sayAndListenNode;
    private AgiChannel channel;

    public SayAndListenAction(SayAndListenNode sayAndListenNode, AgiChannel channel) {
        this.sayAndListenNode = sayAndListenNode;
        this.channel = channel;
    }

    @Override
    public String execute(Context context) {
        String phrase = "";

        try {
            channel.exec("command", "text + phrase");
//                todo get response
            return channel.getData("asf", 100);
        } catch (AgiException e) {
            e.printStackTrace();
        }

        return "";
    }
}
