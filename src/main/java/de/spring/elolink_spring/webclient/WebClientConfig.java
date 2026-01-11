package de.spring.elolink_spring.webclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    public static final WebClient CONNECTION =
            WebClient.create("https://e04fc1aeb36e.ngrok-free.app");

}
