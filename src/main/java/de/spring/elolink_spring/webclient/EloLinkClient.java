package de.spring.elolink_spring.webclient;

import org.springframework.core.ParameterizedTypeReference;

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
        entry.put("description","Der Gründer von EloLink");
        entry.put("gender","0");
        entry.put("password","-");
        entry.put("uuid","1a0cdb45-9e19-4027-9cf3-6b8096b4fe8c");
        entry.put("profilePicture","-");
        entry.put("publicKey","MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzL6kcF9XWoEQN+Vih65muZon3/pyuvC05vyfk1M3ADOzKSU20/lHM8+45R3aGEH56eOy4qSe5kN77UkhuF7qs3/9NH3tT97XbNlewBuybUxfHsTCDPggfKVEIWo4XsmmH/sNRq8z50GUPX7wHoD7CObUgenlr/geXfeswZAHAzdJei6GSsRyiziLHZjRflQgIT1J/rdZZl/X+tcoGjd6KNewUk2wsaMV/i5+DcFeOhqC9AUYJZKC97ldND5dJpv4dTt2jfzukGOhKw4YjDctGPwKpAUrjxWOjtP4hQcpNl/Ayr1EIzThw6HHRbMtZoLP4BRXyRs7cC+YkheSS2FBqwIDAQAB");
        entry.put("timestamp", "2026-01-13T22:04:05.424312500");
        entry.put("userName","Elo");


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

    public String getUser(String uuid){
        return get("/elolink/getuser" + uuid, new ParameterizedTypeReference<String>() {});
    }



}
