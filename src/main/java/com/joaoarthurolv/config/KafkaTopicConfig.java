package com.joaoarthurolv.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @author João Arthur (joaoarthur.ufrn@gmail.com) on 12/06/2023
 */
@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic joaoarthurolvTopic(){
        return TopicBuilder.name("joaoarthurolv").build();
    }
}
