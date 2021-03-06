package com.net.common.graph.nodes;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.net.common.asterisk.ExtraNode;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class SayNode extends Node implements ExtraNode {
    private String speech;
    private String options;

    @Override
    public String getUserField() {
       return this.speech;
    }

    @Override
    public void setUserField(String value) {
        this.speech = value;
    }
}
