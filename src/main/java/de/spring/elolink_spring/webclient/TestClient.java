package de.spring.elolink_spring.webclient;

import de.spring.elolink_spring.encryption.Encrypter;

public class TestClient {
    public static void main(String[] args) {
        EloLinkClient client = new EloLinkClient();

        System.out.println(
        client.getUser("1a0cdb45-9e19-4027-9cf3-6b8096b4fe8c").get("publicKey"));

    }
}
