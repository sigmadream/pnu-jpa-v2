package com.sangkon.nplus1.controller;

import com.sangkon.nplus1.dto.MemberDto;
import com.sangkon.nplus1.entity.Member;
import com.sangkon.nplus1.repository.MemberRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MemberController {
    private final MemberRepository memberRepository;

    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @GetMapping("/members")
    @ResponseBody
    public List<MemberDto> members() {
        ModelMapper modelMapper = new ModelMapper();
        return memberRepository.findAll().stream().map(m -> modelMapper.map(m, MemberDto.class)).collect(Collectors.toList());
    }
}
