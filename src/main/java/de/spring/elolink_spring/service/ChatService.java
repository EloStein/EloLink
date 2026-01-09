package de.spring.elolink_spring.service;

import de.spring.elolink_spring.entity.ChatEntity;
import de.spring.elolink_spring.entity.ProfileEntity;
import de.spring.elolink_spring.entity.StudentEntity;
import de.spring.elolink_spring.entity.UuidEntity;
import de.spring.elolink_spring.repository.ChatRepository;
import de.spring.elolink_spring.repository.ProfileRepository;
import jakarta.transaction.Transactional;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

@Service
public class ChatService {

    @Autowired
    private ChatRepository chatRepository;

    @Transactional
    public String addChat(ChatEntity chatEntity) {
            chatEntity.setId(null == chatRepository.findMaxId() ? 0 : chatRepository.findMaxId() + 1);
            chatRepository.save(chatEntity);
            return "#Saved Chat " + chatEntity.getMessage() + " added successfully";
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
