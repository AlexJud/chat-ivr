package com.net.dialog.service;

import com.net.common.graph.nodes.Node;
import com.net.dialog.models.commands.Executable;
import com.net.dialog.models.commands.SayCommand;

public class CommandFactory {
    public static Executable buildCommand(Node name) {
        switch (name.getClass().getSimpleName()) {
            case "SayCommand":
                return new SayCommand();
        }
        return null;
    }

}
