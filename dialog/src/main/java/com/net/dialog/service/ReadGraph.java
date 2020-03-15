package com.net.dialog.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.net.common.graph.Json;
import com.net.common.graph.nodes.Node;
import com.net.dialog.models.Context;

import java.util.Map;
import java.util.stream.Collectors;

public class ReadGraph {

    private static ObjectMapper mapper = new ObjectMapper();

    public synchronized static Context parseJson(String json) throws JsonProcessingException {
        Json json2 = mapper.readValue(
                "{\"rootNodeId\":1,\"nodes\":[{\"type\":\"say_node\",\"id\":1,\"links\":[{\"nodeId\":1,\"condition\":\"test\"},{\"nodeId\":2,\"condition\":\"test2\"}],\"speech\":\"text\",\"options\":null},{\"type\":\"say_node\",\"id\":2,\"links\":[{\"nodeId\":1,\"condition\":\"test\"},{\"nodeId\":2,\"condition\":\"test2\"}],\"speech\":\"text2\",\"options\":null}]}"
                , Json.class);

        Map<Long, Node> nodeMap = json2.getNodes().stream()
                .collect(Collectors.toMap(Node::getId, i -> i));

        return new Context(nodeMap.get(json2.getRootNodeId()),nodeMap);
    }
}
