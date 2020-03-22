package com.net.common.graph.nodes;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Filter extends Node {
    private String filter;
}
