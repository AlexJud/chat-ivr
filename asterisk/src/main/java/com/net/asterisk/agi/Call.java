package com.net.asterisk.agi;

import com.net.common.asterisk.Session;
import com.net.common.entities.Destination;
import com.net.data.repositories.DestinationRepository;
import com.net.data.repositories.ScenarioRepository;
import com.net.dialog.Dialog;
import org.asteriskjava.fastagi.AgiChannel;
import org.asteriskjava.fastagi.AgiException;
import org.asteriskjava.fastagi.AgiRequest;
import org.asteriskjava.fastagi.BaseAgiScript;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Call extends BaseAgiScript {

    @Autowired
    private DestinationRepository destinationRepository;
    @Autowired
    private ScenarioRepository scenarioRepository;

    @Autowired
    private Dialog dialog;

    @Override
    public void service(AgiRequest request, AgiChannel channel) throws AgiException {

        Optional<Destination> byPoint = destinationRepository.findByPoint(request.getCallerIdNumber());

        if (byPoint.isPresent()){
            Session session = new Session(byPoint.get());
//       with destinationRepository -> getScenario

            answer();

            dialog.run(channel, session);

            hangup();
        }

//      if null??

    }
}
