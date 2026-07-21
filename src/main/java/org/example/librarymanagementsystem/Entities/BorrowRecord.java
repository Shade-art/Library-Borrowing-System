package org.example.librarymanagementsystem.Entities;

import jakarta.persistence.*;
import lombok.Data;
import org.example.librarymanagementsystem.enums.BorrowStatus;
import java.time.LocalDate;


@Entity
@Data
public class BorrowRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private LocalDate borrowDate;
    private LocalDate dueDate;
    private LocalDate dateReturned;

    @Enumerated(EnumType.STRING)
    private BorrowStatus status;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

}
