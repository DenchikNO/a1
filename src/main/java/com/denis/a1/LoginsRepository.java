package com.denis.a1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginsRepository extends JpaRepository<LoginsEntity, Long> {
}
