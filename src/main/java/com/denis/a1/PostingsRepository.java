package com.denis.a1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostingsRepository extends JpaRepository<PostingsEntity, Long> {
}
