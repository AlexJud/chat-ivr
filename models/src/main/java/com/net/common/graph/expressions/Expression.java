package com.net.common.graph.expressions;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.net.common.graph.nodes.SayNode;
import lombok.Data;

@Data
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "condition")
@JsonSubTypes({
        @JsonSubTypes.Type(value = EqualsExpression.class, name = "include"),
})
public abstract class Expression {

    abstract public boolean test(String result);
}
