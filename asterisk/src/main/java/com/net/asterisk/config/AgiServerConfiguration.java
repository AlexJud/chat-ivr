package com.net.asterisk.config;

import com.net.asterisk.agi.Call;
import org.asteriskjava.fastagi.AgiScript;
import org.asteriskjava.fastagi.AgiServerThread;
import org.asteriskjava.fastagi.DefaultAgiServer;
import org.asteriskjava.live.AsteriskServer;
import org.asteriskjava.live.DefaultAsteriskServer;
import org.asteriskjava.manager.ManagerConnection;
import org.asteriskjava.manager.ManagerConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AgiServerConfiguration {
    @Bean
    public AgiServerThread agiServerThread() {
        AgiServerThread agiServerThread = new AgiServerThread(getDefaultAgiServer());
        agiServerThread.startup();
        return agiServerThread;
    }

    @Bean
    public DefaultAgiServer getDefaultAgiServer() {
        return new DefaultAgiServer(getAsteriskAgiScript());
    }

    @Bean
    // TODO: 14.03.2020 new?? Call 
    public AgiScript getAsteriskAgiScript() {
        return new Call();
    }

    //        @Bean
    public ManagerConnection getManagerConnection() {
        ManagerConnectionFactory factory = new ManagerConnectionFactory("192.168.1.130", "manager", "pass");
        return factory.createManagerConnection();
    }

    @Bean
    public AsteriskServer getAsteriskServer() {
        return new DefaultAsteriskServer("192.168.1.130", "manager", "pass");

    }
}
