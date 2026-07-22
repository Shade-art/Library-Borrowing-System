package org.example.librarymanagementsystem.services;

import org.example.librarymanagementsystem.Entities.Member;
import org.example.librarymanagementsystem.dto.CreateMemberRequestDto;
import org.example.librarymanagementsystem.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    MemberService(MemberRepository memberRepository)
    {
        this.memberRepository = memberRepository;
    }

    public void saveMember(CreateMemberRequestDto user){
        Member member = new Member();

        Long sequence = memberRepository.getNextMembershipNumber();
        String membershipNumber = String.format("MEM%04d", sequence);
        member.setMembershipNumber(membershipNumber);

        member.setFullName(user.getFullName());
        member.setEmail(user.getEmail());
        member.setPhoneNumber(user.getPhoneNumber());
        member.setJoinedDate(LocalDate.now());

        memberRepository.save(member);


    }
}
