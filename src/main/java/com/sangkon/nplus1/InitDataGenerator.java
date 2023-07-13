package com.sangkon.nplus1;

import com.sangkon.nplus1.entity.Member;
import com.sangkon.nplus1.entity.Team;
import com.sangkon.nplus1.repository.MemberRepository;
import com.sangkon.nplus1.repository.TeamRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class InitDataGenerator implements ApplicationRunner {
    private final MemberRepository memberRepository;
    private final TeamRepository teamRepository;

    public InitDataGenerator(MemberRepository memberRepository, TeamRepository teamRepository) {
        this.memberRepository = memberRepository;
        this.teamRepository = teamRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Team team1 = createTeam("team 1");
        Team team2 = createTeam("team 2");
        createMember("홍길동1", team1);
        createMember("홍길동2", team2);
    }

    private Member createMember(String name, Team team) {
        Member member = memberRepository.findByName(name);
        if (member == null) {
            member = new Member();
            member.setName(name);
            member.setTeam(team);
            return memberRepository.save(member);
        }
        return member;
    }

    private Team createTeam(String teamName) {
        Team team = teamRepository.findByName(teamName);
        if (team == null) {
            team = new Team();
            team.setName(teamName);
            return teamRepository.save(team);
        }
        return team;
    }
}
