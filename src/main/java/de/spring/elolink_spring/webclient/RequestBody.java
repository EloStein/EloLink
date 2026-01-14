package de.spring.elolink_spring.webclient;

import de.spring.elolink_spring.rest.dto.ChatDto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class RequestBody extends HashMap<String, Object> {

    public void advancedPut(List<String> keys, List<Object> values){
        keys.stream().forEach(k -> {
            put(k, values.get(keys.indexOf(k)));
        });
    }

    public static RequestBody fromChatDto(ChatDto chat){
        RequestBody requestBody = new RequestBody();
        requestBody.put("sender",chat.getSender());
        requestBody.put("receiver",chat.getReceiver());
        requestBody.put("message",chat.getMessage());
        return requestBody;
    }


}
