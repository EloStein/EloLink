package de.spring.elolink_spring.controller;

import de.spring.elolink_spring.entity.ChatEntity;
import de.spring.elolink_spring.entity.ConversationEntity;
import de.spring.elolink_spring.entity.ProfileEntity;
import de.spring.elolink_spring.entity.UuidEntity;
import de.spring.elolink_spring.service.ChatService;
import de.spring.elolink_spring.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class ChatController {

    @Autowired
    private ChatService chatService;

    @RequestMapping(value = "/elolink/db/chat/addchat", method = RequestMethod.POST)
    public String addChat(@RequestBody ChatEntity chatEntity){
        return chatService.addChat(chatEntity);
    }

    @RequestMapping(value = "/elolink/db/chat/getchats", method = RequestMethod.GET)
    public List<ChatEntity> getChats(){
        return chatService.getChats();
    }

    @RequestMapping(value = "/elolink/db/chat/getchats/fromuuid", method = RequestMethod.POST)
    public List<ChatEntity> getChatsFromSender(@RequestBody UuidEntity uuidEntity){
        return chatService.getChatsFromSender(uuidEntity);
    }

    @RequestMapping(value = "/elolink/db/chat/getconversation", method = RequestMethod.POST)
    public List<ChatEntity> getConversation(@RequestBody ConversationEntity conversationEntity){
        UuidEntity u1 = new UuidEntity();
        u1.setUuid("9ef3cf0c-fc71-45cc-abe8-76c8ca90e86b");
        UuidEntity u2 = new UuidEntity();
        u2.setUuid("1a0cdb45-9e19-4027-9cf3-6b8096b4fe8c");
        return chatService.getConversation(conversationEntity.getUuid1(), conversationEntity.getUuid2());
    }

    @RequestMapping(value = "/elolink/db/chat/deletechat", method = RequestMethod.GET)
    public String deleteChat(){
        return chatService.deleteAllChats();
    }

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
    }

}
