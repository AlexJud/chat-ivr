package com.net.common.graph.nodes;

import com.net.common.asterisk.ExtraNode;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SayAndListenNode extends Node implements ExtraNode {
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
