package com.sangkon.nplus1.repository;

import com.sangkon.nplus1.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer> {
    Team findByName(String name);
}
