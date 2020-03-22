package com.net.dialog.models.commands;

import com.net.common.graph.nodes.Node;
import com.net.dialog.models.Context;
import org.asteriskjava.fastagi.AgiChannel;

public interface Executable {

    String execute(Context context);
}
