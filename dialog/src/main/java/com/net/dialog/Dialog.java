package com.net.dialog;

import com.net.common.asterisk.Session;
import com.net.common.entities.Scenario;
import org.asteriskjava.fastagi.AgiChannel;
import org.asteriskjava.fastagi.AgiRequest;

public interface Dialog {
    String run(AgiChannel channel, Session session);
}
