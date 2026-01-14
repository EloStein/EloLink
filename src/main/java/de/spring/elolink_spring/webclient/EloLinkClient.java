package de.spring.elolink_spring.webclient;

import org.springframework.core.ParameterizedTypeReference;

import java.time.LocalDateTime;
import java.util.Map;

public class EloLinkClient extends EloLinkClientHelper {

    public static void main(String[] args) {
        RequestBody entry = new RequestBody();
//        entry.put("signature","Singed");
//        entry.put("sender","Elo2");
//        entry.put("receiver","Mr BRI");
//        entry.put("message","hi from java Client");
//        entry.put("aesKeyRec","aesKeyRec");
//        entry.put("aesKeyOwn","aesKeyOwn");
//        entry.put("timestamp","jetzt grad");

//        entry.put("description","Der Gründer von EloLink");
//        entry.put("gender","0");
//        entry.put("password","-");
//        entry.put("uuid","1a0cdb45-9e19-4027-9cf3-6b8096b4fe8c");
//        entry.put("profilePicture","-");
//        entry.put("publicKey","MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzL6kcF9XWoEQN+Vih65muZon3/pyuvC05vyfk1M3ADOzKSU20/lHM8+45R3aGEH56eOy4qSe5kN77UkhuF7qs3/9NH3tT97XbNlewBuybUxfHsTCDPggfKVEIWo4XsmmH/sNRq8z50GUPX7wHoD7CObUgenlr/geXfeswZAHAzdJei6GSsRyiziLHZjRflQgIT1J/rdZZl/X+tcoGjd6KNewUk2wsaMV/i5+DcFeOhqC9AUYJZKC97ldND5dJpv4dTt2jfzukGOhKw4YjDctGPwKpAUrjxWOjtP4hQcpNl/Ayr1EIzThw6HHRbMtZoLP4BRXyRs7cC+YkheSS2FBqwIDAQAB");
//        entry.put("timestamp", "2026-01-13T22:04:05.424312500");
//        entry.put("userName","Elo");

        entry.put("description","Spion von Alpha Centauri B");
        entry.put("gender","0");
        entry.put("password","-");
        entry.put("uuid","8a397b19-b2be-4103-9494-b596029eb158");
        entry.put("profilePicture","-");
        entry.put("publicKey","MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA8JPKampveFvhWj5RTd3NdMAIryNkY9/b2MOUqynOl6VdlE2m3o9PGHPoAVZkeQU5YH2J3Iu5Xt9PLVCnprJhnZzG3Udbvz4l7ZddXp+cQFX3X1ogsuCICJqlgHx6q/8Ne4QOK7Uv7IBgdrWYnCf34Ehe0Ye9tazJ+bJytckObSdws0vyg3XlkWBU7jMEM0RlyXcI9B37HONsZ7Pjo9gJizC0kUczXoI4/1/5iMh4UXueSCm4akRzQ849XLH14CJi4heQE5f3S0Vp3G5n5TnlJdR7CQ6sFjHJdLcawfrQGT8LCLRdvVCCtzNS9VXQFMIneySKFjvikyO7TiiVwFrkFwIDAQAB");
        entry.put("timestamp", "2026-01-14T15:54:38.732770");
        entry.put("userName","Mät");

        EloLinkClient client = new EloLinkClient();
        System.out.println(client.addUser(entry));
    }

    public EloLinkClient() {
        super("http://localhost:25270");
    }

    public String ping(){
        return get("/elolink/ping", new ParameterizedTypeReference<String>() {});
    }

    public String addChat(RequestBody requestBody){
        return post("/elolink/addchat", requestBody , new ParameterizedTypeReference<String>() {});
    }

    public String deleteChat(String sender, String receiver, String timestamp, RequestBody requestBody){
        return delete("/elolink/deletechat/" + sender + "/" + receiver + "/" + timestamp, new ParameterizedTypeReference<String>() {});
    }

    public String updateChat(String sender, String receiver, String timestamp, RequestBody requestBody){
        return update("/elolink/updatechat/" + sender + "/" + receiver + "/" + timestamp, requestBody , new ParameterizedTypeReference<String>() {});
    }

    public String addUser(RequestBody requestBody){
        return post("/elolink/adduser", requestBody, new ParameterizedTypeReference<String>() {});
    }

    public String updateUser(String uuid, RequestBody requestBody){
        return update("/elolink/updateuser/" + uuid, requestBody, new ParameterizedTypeReference<String>() {});
    }

    public Map<String, Object> getUser(String uuid){
        return get("/elolink/getuser/" + uuid, new ParameterizedTypeReference<Map<String, Object>>() {});
    }



}
