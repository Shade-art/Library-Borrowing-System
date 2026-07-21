package org.example.librarymanagementsystem.Entities;

import jakarta.persistence.*;
import lombok.Data;
import org.example.librarymanagementsystem.enums.BookStatus;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String author;

    @Column(unique = true, nullable = false)
    private String isbn;

    private LocalDate dateAdded;

    @Enumerated(EnumType.STRING)
    private BookStatus status;

    @OneToMany(mappedBy = "book")
    private List<BorrowRecord> borrowRecords;

}
