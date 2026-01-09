package de.spring.elolink_spring.http;

import org.springframework.web.reactive.function.client.WebClient;

public class ClientConfig {

    public static final WebClient CONNECTION =
            WebClient.create("https://8b5c3dd6fb6b.ngrok-free.app");


}
