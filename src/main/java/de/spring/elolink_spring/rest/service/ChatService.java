package de.spring.elolink_spring.rest.service;

import de.spring.elolink_spring.encryption.KeyGenerator;
import de.spring.elolink_spring.rest.dto.ChatDto;
import de.spring.elolink_spring.rest.entity.ChatEntity;
import de.spring.elolink_spring.unused.UuidEntity;
import de.spring.elolink_spring.rest.repository.ChatRepository;
import de.spring.elolink_spring.webclient.EloLinkClient;
import de.spring.elolink_spring.webclient.RequestBody;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

@Service
public class ChatService {

    @Autowired
    private ChatRepository chatRepository;
    private EloLinkClient eloLinkClient;

    public String addChat(ChatDto chatDto) {

//        SecretKey aesKeyOwn = KeyGenerator.genAesKey();
//        SecretKey aesKeyRec = KeyGenerator.genAesKey();


        RequestBody requestBody = RequestBody.fromChatDto(chatDto);
        requestBody.put("signature","false");
        return requestBody.get("sender").toString();
    }











    public List<ChatEntity> getChats(){
        return chatRepository.findAll();
    }

    public List<ChatEntity> getChatsFromSender(UuidEntity uuidEntity) {
        return chatRepository.findBySender(uuidEntity.getUuid());
    }

    public List<ChatEntity> getConversation(String uuid1, String uuid2){
        List<ChatEntity> c1 = chatRepository.findBySender(uuid1);
        List<ChatEntity> c2 = chatRepository.findBySender(uuid2);

        c1.removeIf(chatEntity -> !Objects.equals(chatEntity.getReceiver(), uuid2));
        c2.removeIf(chatEntity -> !Objects.equals(chatEntity.getReceiver(), uuid1));

        List<ChatEntity> conversation = new ArrayList<>();
        conversation.addAll(c1);
        conversation.addAll(c2);

        conversation.sort(Comparator.comparing(ChatEntity::getTimestamp).reversed());
        return conversation;

    }

    @Transactional
    public String deleteAllChats(){
        chatRepository.deleteAllNative();
        return "#Deleted all Chats";
    }
}
