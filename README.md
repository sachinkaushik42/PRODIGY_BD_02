# PRODIGY_BD_02 -> User Management REST API with Database

📦This repository contains "Task 2" for my Backend Development Internship at "Prodigy InfoTech"🚀.

🎯The goal of this project is to extend the previous REST API to use a relational database (MySQL) for persistent storage, integrating it via Spring Data JPA (ORM) to handle data schemas and manage secure database connectivity.

🌟Current Progress --> Day 1 🚀 -> Created the pom.xml configuration file with essential dependencies for Spring Web, Spring Data JPA, and the MySQL Driver to establish the database foundation.

Day 2 🔄 -> Added `application.properties` to establish the connection link to the local database instance and created the automated version-controlled schema setup scripts inside the `db/migration` folder.

Day 3 💾 -> Implemented the Core Data Layer by adding the `User.java` JPA entity class to map database records and the `UserRepository.java` interface to handle automated database operations within the `com.sachin.userapi` package.
