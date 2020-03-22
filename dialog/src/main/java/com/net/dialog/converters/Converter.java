package com.net.dialog.converters;

import com.net.common.graph.nodes.Node;

public interface Converter {

    boolean isInstanceOf (Node node);
    Node transform(Node node);
}
