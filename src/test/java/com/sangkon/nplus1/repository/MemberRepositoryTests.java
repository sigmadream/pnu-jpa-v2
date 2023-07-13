package com.sangkon.nplus1.repository;

import com.sangkon.nplus1.entity.Member;
import com.sangkon.nplus1.entity.Team;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class MemberRepositoryTests {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    TeamRepository teamRepository;


    @Test
    void testQuery() {
        Team team1 = new Team();
        team1.setName("Team A");
        Team savedTeam1 = teamRepository.save(team1);

        Team team2 = new Team();
        team2.setName("Team B");
        Team savedTeam2 = teamRepository.save(team2);

        Member member1 = new Member();
        member1.setName("홍길동A");
        member1.setTeam(savedTeam1);
        memberRepository.save(member1);

        Member member2 = new Member();
        member2.setName("홍길동B");
        member2.setTeam(savedTeam2);
        memberRepository.save(member2);

        memberRepository.findAll().forEach(System.out::println);
    }

}
