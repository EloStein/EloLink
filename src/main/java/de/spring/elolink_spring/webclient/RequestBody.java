package de.spring.elolink_spring.webclient;

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


}
