package com.net.asterisk.processing;

import com.net.asterisk.actions.AsteriskActions;
import com.net.common.asterisk.Session;
import com.net.common.entities.Destination;
import com.net.dialog.DataNavigate;
import com.net.dialog.GraphLogicImp;
import org.asteriskjava.fastagi.AgiChannel;
import org.springframework.stereotype.Service;

@Service
public class CallProcessing {
//
//    @Autowired
//    private ScenarioRepository scenarioRepository;

    public void reply(AgiChannel channel, Destination destination) {

//        todo getScenario

//        scenarioRepository.findById(destination.getScenario())
        Session session = new Session(destination.getScenario());

//        todo new findSpeechprocess
//        ?? new(v) or singleton
        //                                                  FIXME: 22.03.2020 singleton
        DataNavigate dataRoad = new GraphLogicImp(session, new AsteriskActions(channel));
        dataRoad.runProcess();

//            todo handle errors, timeout and so...


    }

}
