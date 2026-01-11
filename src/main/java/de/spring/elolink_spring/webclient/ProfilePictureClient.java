package de.spring.elolink_spring.webclient;

import org.springframework.http.HttpStatusCode;

public class ProfilePictureClient {

    public static String getPfP(String uuid) {
        return WebClientConfig.CONNECTION.get()
                .uri("/pp")
                .header("uuid", uuid)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

    public static HttpStatusCode postPfP(String sender, String pfp) {
        return WebClientConfig.CONNECTION.post()
                .uri("/pp")
                .header("sender", sender)
                .bodyValue(pfp)
                .retrieve()
                .toBodilessEntity()
                .block()
                .getStatusCode();
    }

}
