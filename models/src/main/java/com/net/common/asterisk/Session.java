package com.net.common.asterisk;

import com.net.common.entities.Destination;
import lombok.Data;

@Data
public class Session {
    private Destination destination;

    public Session(Destination destination) {
        this.destination = destination;
    }
}
