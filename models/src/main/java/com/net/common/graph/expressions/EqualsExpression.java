package com.net.common.graph.expressions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class EqualsExpression extends Expression {

    private String[] args;

    @Override
    public boolean test(String result) {
        return true;
    }
}
