package de.spring.elolink_spring.repository;

import de.spring.elolink_spring.entity.ChatEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatRepository extends JpaRepository<ChatEntity, Integer> {

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM chat_entity", nativeQuery = true)
    void deleteAllNative();
    public boolean existsById(String id);
    //public List<ChatEntity> findBySender(String uuid);
    @Query("select max(s.id) from ChatEntity s")
    public Integer findMaxId();
    List<ChatEntity> findBySender(String sender);
}
