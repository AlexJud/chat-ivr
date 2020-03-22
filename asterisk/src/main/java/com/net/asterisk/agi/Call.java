package com.net.asterisk.agi;

import com.net.asterisk.processing.CallProcessing;
import com.net.common.entities.Destination;
import com.net.data.repositories.DestinationRepository;
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
    private CallProcessing callProcessing;


    // Parse who and whom -> answer
    @Override
    public void service(AgiRequest request, AgiChannel channel) throws AgiException {

        Optional<Destination> byPoint = destinationRepository.findByPoint(request.getCallerIdNumber());

        if (byPoint.isPresent()){

            answer();
            // set destination
            callProcessing.reply(channel, byPoint.get());

            hangup();
        }

//      if null??

    }
}
