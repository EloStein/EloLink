package de.spring.elolink_spring.unused;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public HashMap<String, String> hello(){
        return HelloService.soutHello();
    }

    @PostMapping("/elolink/message/send")
    public String send(@RequestBody HelloEntity name){
        System.out.println("Hello " + name.getName());
        return "Hello " + name.getName();
    }
}
