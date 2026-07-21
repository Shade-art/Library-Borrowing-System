package org.example.librarymanagementsystem.Entities;

import jakarta.persistence.*;
import lombok.Data;
import org.example.librarymanagementsystem.enums.BorrowStatus;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(unique = true, nullable = false)
    private String membershipNumber;

    @Column(nullable = false)
    private String fullName;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private LocalDate joinedDate;

    @OneToMany(mappedBy = "member")
    private List<BorrowRecord> borrowRecord;
}