package com.net.dialog.models;

import com.net.common.asterisk.Variable;
import com.net.common.graph.nodes.Node;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Context {
    private Node currentNode;
    private Map<Long, Node> nodeMap;
    private Map<String, Variable> varMap;

    public Context(Node rootNode, Map<Long, Node> nodeMap) {
        this.currentNode = rootNode;
        this.nodeMap = nodeMap;
        this.varMap = new HashMap<>();
    }
}
