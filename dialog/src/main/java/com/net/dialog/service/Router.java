package com.net.dialog.service;


import com.net.common.graph.Link;
import com.net.common.graph.nodes.Node;
import com.net.dialog.models.Context;

import java.util.List;
import java.util.stream.Collectors;

public class Router {

    public static String navigate(String result, Context context){
        List<Link> links = context.getCurrentNode().getLinks();

        List<Link> collect = links.stream()
                .filter(link -> link.getExpression().test(result))
                .collect(Collectors.toList());

        if (collect.size() > 1){
            System.out.println("Found more than 1 condition in expressions node");
        } else if (collect.size() == 0){
            context.setCurrentNode(null);
        }

        Node nextNode = context.getNodeMap().get(collect.get(0).getNodeId());
        context.setCurrentNode(nextNode);


        return "";
    }
}
