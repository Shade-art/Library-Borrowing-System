package org.example.librarymanagementsystem.repository;

import org.example.librarymanagementsystem.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
