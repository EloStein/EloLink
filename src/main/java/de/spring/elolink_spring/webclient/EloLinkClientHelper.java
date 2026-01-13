package de.spring.elolink_spring.webclient;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import java.awt.*;

public abstract class EloLinkClientHelper {

    private final WebClient webClient;

    public EloLinkClientHelper(String baseUrl) {
        this.webClient = WebClient.builder()
                .baseUrl(baseUrl)
                .build();
    }

    public <T> T get(String uri, ParameterizedTypeReference<T> responseType) {
        return webClient.get()
                .uri(uri)
                .retrieve()
                .bodyToMono(responseType)
                .block();
    }

    public <T, R> R post(String uri, T requestBody, ParameterizedTypeReference<R> responseType) {
        return webClient.post()
                .uri(uri)
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(requestBody)
                .retrieve()
                .bodyToMono(responseType)
                .block();
    }

    public <T, R> R update(String uri, T requestBody, ParameterizedTypeReference<R> responseType) {
        return webClient.put()
                .uri(uri)
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(requestBody)
                .retrieve()
                .bodyToMono(responseType)
                .block();
    }

    public <R> R delete(String uri, ParameterizedTypeReference<R> responseType) {
        return webClient.delete()
                .uri(uri)
                .retrieve()
                .bodyToMono(responseType)
                .block();
    }
}
