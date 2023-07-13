package com.sangkon.nplus1.controller;

import com.sangkon.nplus1.entity.Member;
import com.sangkon.nplus1.repository.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MemberController {
    private final MemberRepository memberRepository;

    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @GetMapping("/members")
    @ResponseBody
    public List<Member> members() {
        return memberRepository.findAll();
    }
}
