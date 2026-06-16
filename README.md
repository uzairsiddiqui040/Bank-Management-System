# Bank Management System

A Java-based desktop application for managing daily banking tasks.

---

## What it does

- Handles user login and new account registration
- Supports deposit, withdrawal, and transfer between accounts
- Shows current balance and past transaction logs
- Generates a unique account number for each new user
- Stores all data persistently using MySQL

---

## Built with

- Java (Swing for UI, JDBC for database connection)
- MySQL for data storage
- OOP concepts for code organization

---

## Project structure

- `src/` – contains all Java source files
- `bank_management_system.sql` – database schema and sample data
- `README.md` – this file

---

## Database tables

- `Users` – stores login credentials and customer info
- `Accounts` – links users to their account and balance
- `Transactions` – logs every credit, debit, and transfer
- ....

---

## How to set it up

1. Clone the repository to your local machine
2. Create a database in MySQL named `bank_management`
3. Import the provided `.sql` file into that database
4. Open the project in IntelliJ or Eclipse
5. Update database credentials in `DBConnection.java` (URL, username, password)
6. Compile and run `Main.java`

---

## What I learned from this project

- Building a functional GUI with Swing
- Connecting Java applications to a MySQL database using JDBC
- Applying OOP principles like encapsulation and inheritance
- Managing runtime errors using exception handling
- Maintaining data consistency during financial transactions

---

## Possible improvements

- Add password hashing for better security
- Include an admin panel for monitoring users
- Generate printable transaction receipts

---

## Connect

- GitHub: [uzairsiddiqui040](https://github.com/uzairsiddiqui040)

---
