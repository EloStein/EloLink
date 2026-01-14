package de.spring.elolink_spring.unused;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfileRepository extends JpaRepository<ProfileEntity, Integer> {

    public boolean existsByUuid(String uuid);
    public List<ProfileEntity> findByUuid(String uuid);
    @Query("select max(s.id) from ProfileEntity s")
    public Integer findMaxId();
}
