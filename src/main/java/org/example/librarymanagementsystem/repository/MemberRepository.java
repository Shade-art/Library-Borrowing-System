package org.example.librarymanagementsystem.repository;

import org.example.librarymanagementsystem.Entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MemberRepository extends JpaRepository<Member,Integer> {

    @Query(value = "SELECT nextval('membership_number_seq')", nativeQuery = true)
    Long getNextMembershipNumber();
}
