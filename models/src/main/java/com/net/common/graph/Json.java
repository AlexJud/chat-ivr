package com.net.common.graph;

import com.net.common.graph.nodes.Node;
import lombok.Data;

import java.util.List;

@Data
public class Json {
    private Long rootNodeId;
    private List<Node> nodes;
}
