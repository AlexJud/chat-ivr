package com.net.common.graph.nodes;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class SayNode extends Node {
    private String speech;
    private String options;
}
