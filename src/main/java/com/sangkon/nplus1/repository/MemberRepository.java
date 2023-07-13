package com.sangkon.nplus1.repository;

import com.sangkon.nplus1.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    Member findByName(String name);
}
