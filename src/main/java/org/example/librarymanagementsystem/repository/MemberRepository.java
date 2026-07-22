package org.example.librarymanagementsystem.repository;

import org.example.librarymanagementsystem.Entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Integer> {
}
