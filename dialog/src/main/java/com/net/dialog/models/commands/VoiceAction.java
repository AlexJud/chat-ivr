package com.net.dialog.models.commands;

import com.net.common.graph.nodes.Node;

public interface VoiceAction {
//    String run ();
//    String say(Node node);
//    String sayAndListen(Node node);
    Executable build (Node node);
}
