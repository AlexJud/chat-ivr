package com.net.common.graph;

import com.net.common.graph.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Link {
    private Long nodeId;
    private Expression expression;
    private String variable;
}
