package com.net.common.graph.nodes;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.net.common.graph.Link;
import lombok.Data;

import java.util.List;

@Data
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = SayNode.class, name = "say_node"),
})
public class Node {
    private Long id;
    private List<Link> links;

    public String getUserField() {
        return null;
    }

    public void setUserField(String value) {
    }

}
