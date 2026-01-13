package de.spring.elolink_spring.unused;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class HelloService {

    public static HashMap<String, String> soutHello(){
        System.out.println("Hello there!");
        HashMap<String, String> helloMap = new HashMap<>();
        helloMap.put("a","Hallo");
        helloMap.put("b","Hello");
        helloMap.put("c","Salut");

        try {
            send("Ich","Du","Baum");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return helloMap;
    }

    public static int send(String sender, String receiver, String message) throws Exception {

        HttpURLConnection connection = (HttpURLConnection) new URL("https://302b79a3d36a.ngrok-free.app" + "/send").openConnection();

        connection.setRequestProperty("sender",sender);
        connection.setRequestProperty("receiver",receiver);
        connection.setRequestProperty("aesKey", "AesKey");
        connection.setRequestProperty("aesKeyOwn", "AesKeyOwn");
        connection.setRequestMethod("POST");

        connection.setDoOutput(true);
        OutputStream os = connection.getOutputStream();
        os.write(message.getBytes(StandardCharsets.UTF_8));
        os.flush();
        os.close();

        int rCode = connection.getResponseCode();
        return rCode;
    }
}
