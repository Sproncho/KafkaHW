package com.karafka.karafka;

import org.apache.logging.log4j.message.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class KarafkaApplication {

    public static void main(String[] args) {

        SpringApplication.run(KarafkaApplication.class, args);

    }
    @Bean
    public  Consumer<String>getMessage(){
       return message -> System.out.println(message);
    }
}
