package com.net.common.asterisk;

import com.net.common.entities.Destination;
import com.net.common.entities.Scenario;
import lombok.Data;

@Data
public class Session {
    private Scenario scenario;

    public Session(Scenario scenario) {
        this.scenario = scenario;
    }
}
