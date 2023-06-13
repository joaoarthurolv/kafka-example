package com.joaoarthurolv;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author João Arthur (joaoarthur.ufrn@gmail.com) on 13/06/2023
 */

@Component
public class KafkaListeners {

    @KafkaListener(topics = "joaoarthurolv", groupId = "groupId")
    void listener(String data){
        System.out.println("Listener received: " + data);
    }

}
