package de.spring.elolink_spring.webclient;

public class ChatClient {

    public static void main(String[] args) {
        getChat("1a0cdb45-9e19-4027-9cf3-6b8096b4fe8c");
    }

    public static String getChat(String uuid){
        return WebClientConfig.CONNECTION.get()
                .uri("/chat")
                .header("uuid", uuid)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

}
