package de.spring.elolink_spring.rest.controller;

import de.spring.elolink_spring.rest.dto.ChatDto;
import de.spring.elolink_spring.rest.entity.ChatEntity;
import de.spring.elolink_spring.unused.ConversationEntity;
import de.spring.elolink_spring.unused.UuidEntity;
import de.spring.elolink_spring.rest.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class ChatController {

    @Autowired
    private ChatService chatService;

    @RequestMapping(value = "/elolink/local/addchat", method = RequestMethod.POST)
    public String addChat(@RequestBody ChatDto chat){
        return chatService.addChat(chat);
    }









    @RequestMapping(value = "/elolink/db/chat/getconversation", method = RequestMethod.POST)
    public List<ChatEntity> getConversation(@RequestBody ConversationEntity conversationEntity){
        return chatService.getConversation(conversationEntity.getUuid1(), conversationEntity.getUuid2());
    }

    @RequestMapping(value = "/elolink/db/chat/deletechat", method = RequestMethod.GET)
    public String deleteChat(){
        return chatService.deleteAllChats();
    }


}
