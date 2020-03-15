package com.net.common.graph.nodes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.net.common.graph.Json;
import com.net.common.graph.Link;
import com.net.common.graph.expressions.EqualsExpression;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.springframework.test.util.AssertionErrors.assertEquals;


class SayNodeTest {

    @Test
    void testJacksonIO() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        SayNode node = new SayNode();
        node.setId(1L);
        node.setSpeech("text");
        node.setLinks(List.of(new Link(1L,new EqualsExpression("hello test".split(" ")),null), new Link(2L, new EqualsExpression("test2 2".split(" ")),null)));

        String s = mapper.writeValueAsString(node);
        System.out.println(s);
        Node node1 = mapper.readValue(s, Node.class);

        assertEquals("error in mapping from superClass", node, node1);

    }

    @Test
    void testList() throws JsonProcessingException {
//        ObjectMapper mapper = new ObjectMapper();
//        SayNode node = new SayNode();
//        node.setId(1L);
//        node.setSpeech("text");
//        node.setLinks(List.of(new Link(1L,new EqualsExpression("купить продать".split(" ")),null), new Link(2L,"test2 2".split(" "),null)));
//
//        SayNode node2 = new SayNode();
//        node2.setId(2L);
//        node2.setSpeech("text2");
//        Json json1 = new Json();
////
//        node2.setLinks(List.of(new Link(1L,"test"), new Link(2L,"test2")));
//
//        json1.setNodes(List.of(node,node2));
//        json1.setRootNodeId(1L);
//
//        String s = mapper.writeValueAsString(json1);
//        System.out.println(s);
//        Json json = mapper.readValue(s, Json.class);
//
//        assertEquals("error in Json object", json, json1);

    }
}
