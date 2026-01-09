package de.spring.elolink_spring.http;

import org.springframework.http.HttpStatusCode;

public class ProfilePictureClient {

    public static String getPfP(String uuid) {
        return ClientConfig.CONNECTION.get()
                .uri("/key")
                .header("uuid", uuid)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

    public static HttpStatusCode postPfP(String senderUuid, String base64) {
        return ClientConfig.CONNECTION.post()
                .uri("/key")
                .header("sender", senderUuid)
                .bodyValue(base64)
                .retrieve()
                .toBodilessEntity()
                .block()
                .getStatusCode();
    }

}
