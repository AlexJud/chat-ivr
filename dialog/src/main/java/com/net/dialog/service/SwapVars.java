package com.net.dialog.service;

import com.net.common.asterisk.Variable;
import com.net.common.graph.nodes.SayNode;
import com.net.dialog.models.Context;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SwapVars {

    public static String seekVars(String text, Context context){
        text = text.trim();

        return Arrays.stream(text.split(" "))
                .map(word -> {
                    // TODO: 15.03.2020 pattern [A-Za-z]
                    if (word.startsWith("@")) {
                        Variable variable = context.getVarMap().get(word);
                        if (variable == null){
                            return "";
                        }
                        return variable.getValue();
                    } else {
                        return word;
                    }
                }).collect(Collectors.joining(" "));
    }
}
