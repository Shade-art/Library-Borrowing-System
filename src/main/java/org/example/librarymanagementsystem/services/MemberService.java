package org.example.librarymanagementsystem.services;

import org.example.librarymanagementsystem.Entities.Member;
import org.example.librarymanagementsystem.dto.CreateUserRequestDto;
import org.example.librarymanagementsystem.repository.MemberRepository;

public class MemberService {
    private final MemberRepository memberRepository;

    MemberService(MemberRepository memberRepository)
    {
        this.memberRepository = memberRepository;
    }

    public void saveMember(CreateUserRequestDto user){
        Member member = new Member();
        member.setFullName(user.getFullName());
        member.setEmail(user.getEmail());
        member.setPhoneNumber(user.getPhoneNumber());

    }
}
