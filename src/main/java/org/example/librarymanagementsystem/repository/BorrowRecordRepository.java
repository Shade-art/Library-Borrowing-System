package org.example.librarymanagementsystem.repository;

import org.example.librarymanagementsystem.Entities.BorrowRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowRecordRepository extends JpaRepository<BorrowRecord,Integer> {
}
