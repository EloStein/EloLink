package de.spring.elolink_spring.unused;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

    public boolean existsByEmail(String email);
    public List<StudentEntity> findByEmail(String email);
    @Query("select max(s.id) from StudentEntity s")
    public Integer findMaxId();
}
