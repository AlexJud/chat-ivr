package com.net.dialog.converters;

import com.net.common.asterisk.ExtraNode;
import com.net.common.graph.nodes.Node;
import com.net.dialog.models.Context;
import com.net.dialog.service.SwapVars;

public class SwapVariables implements Converter {

    private Context context;

    public SwapVariables(Context context) {
        this.context = context;
    }

    @Override
    public boolean isInstanceOf(Node node) {
        return node instanceof ExtraNode;
    }

    @Override
    public Node transform(Node node) {

        if (isInstanceOf(node)) {
            node.setUserField(SwapVars.seekVars(node.getUserField(), context));
            return node;
        }
        return node;
    }
}
