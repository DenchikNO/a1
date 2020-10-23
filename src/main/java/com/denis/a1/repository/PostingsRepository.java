package com.denis.a1.repository;

import com.denis.a1.domain.PostingsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostingsRepository extends JpaRepository<PostingsEntity, Long> {

    List<PostingsEntity> findAllByPstngDate(String pstngDate);
    List<PostingsEntity> findAll();

}
