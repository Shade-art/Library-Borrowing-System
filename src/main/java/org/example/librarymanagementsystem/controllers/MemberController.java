package org.example.librarymanagementsystem.controllers;

import jakarta.validation.Valid;
import org.example.librarymanagementsystem.Entities.Member;
import org.example.librarymanagementsystem.dto.CreateMemberRequestDto;
import org.example.librarymanagementsystem.services.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    private final MemberService memberService;

    MemberController(MemberService memberService)
    {
        this.memberService = memberService;
    }

    @PostMapping("/members")
    public ResponseEntity<String> addMember(
            @Valid @RequestBody CreateMemberRequestDto memberRequestDto) {

        memberService.saveMember(memberRequestDto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Member registered successfully");
    }
}
