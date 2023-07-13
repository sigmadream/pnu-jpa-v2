package com.sangkon.nplus1.repository;

import com.sangkon.nplus1.entity.Member;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    Member findByName(String name);

    @EntityGraph("MemberWithTeam")
    List<Member> findAll();
}
