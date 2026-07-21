# 📚 Library Management System

A Spring Boot REST API for managing books, members, borrowing, and returning books with transactional consistency.

---

## 🗄️ Entity Relationship Diagram

<p align="center">
  <img src="docs/er-diagram.png" alt="ER Diagram" width="900">
</p>

---

## 🏗️ Database Design

### Entities

- **Admin** – Administrator authentication
- **Member** – Library members
- **Book** – Book catalog
- **BorrowRecord** – Borrowing history and transactions

### Relationships

- One Member → Many BorrowRecords
- One Book → Many BorrowRecords
- Member and Book are connected through BorrowRecord.