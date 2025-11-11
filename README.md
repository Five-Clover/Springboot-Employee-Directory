# Springboot-Employee-Directory
A simple **CRUD (Create, Read, Update, Delete)** Employee Directory application built using **Spring Boot**, designed for self-learning and understanding REST API development.

**1.SpringBoot-Rest-Curddemo-Employee**
---
<img width="1286" height="254" alt="image" src="https://github.com/user-attachments/assets/cbd50605-9bda-4d97-b232-1b87fb80b5bb" />
This Employee Directory project demonstrates the **core fundamentals of building a Spring Boot CRUD REST API**. The application follows proper layered architecture to make the code clean, scalable, and easy to understand for beginners. 

### ✅ How the Application Works

The project uses three main layers:

### **1️⃣ DAO / Repository Layer**

* This layer communicates directly with the database.
* It uses **Spring Data JPA** or manual DAO logic depending on the project setup.
* Responsible for performing operations such as:

  * `findAll()` → Get all employees
  * `findById()` → Get employee by ID
  * `save()` → Insert or update employee
  * `deleteById()` → Delete employee

### **2️⃣ Service Layer**

* Acts as a **bridge between the controller and DAO/repository**.
* Contains **business logic**.
* Ensures that controllers do not directly access the database layer.
* Helps in code reusability and abstraction.

Example service responsibilities:

* Validate employee data
* Apply business rules (ex: prevent duplicates)
* Convert/prepare data before sending to controller

### **3️⃣ REST Controller Layer**

* Handles all **incoming HTTP requests**.
* Uses `EmployeeService` to perform operations.
* Returns JSON responses to the client.
* Defines endpoints such as:

  * `GET /employees`
  * `POST /employees`
  * `PUT /employees`
  * `DELETE /employees/{id}`

### ✅ Full Flow Explanation

```
Client → REST Controller → Service → DAO/Repository → Database
```
**2.Spring Boot-Rest-Curddemo-Employee-with-Spring-Data-JPA**
---
<img width="1380" height="534" alt="image" src="https://github.com/user-attachments/assets/1cd190d0-6c02-4be3-9f78-f693f48eeafe" />
A simplified and efficient **Employee Directory CRUD REST API** built using **Spring Boot** and **Spring Data JPA**. This version reduces boilerplate code by leveraging Spring Data JPA's built‑in repository functionalities.
---

## ✅ What This Version Improves

Compared to the traditional DAO approach, this version:

* Removes manual DAO implementation
* Eliminates repetitive CRUD code
* Uses **JpaRepository** for built‑in CRUD methods
* Improves readability and clean architecture

---

**3.Spring Boot-Rest-Curddemo-Employee-with-Spring-Data-Rest**
<img width="956" height="201" alt="image" src="https://github.com/user-attachments/assets/f30f184a-3a09-4514-a47b-4cc5af4b77da" />
This version of the Employee Directory demonstrates the **most simplified and automated approach** by using **Spring Data REST**. It completely removes the need to write a REST controller or service layer for basic CRUD operations.

Spring Data REST automatically exposes REST endpoints for your JPA repositories, reducing code and simplifying development.

---

## ✅ What This Version Improves

Compared to manual CRUD or Spring Data JPA controller code, Spring Data REST:

* ❌ Removes the need for a REST controller
* ❌ Removes the need for service classes
* ✅ Automatically exposes REST endpoints from repositories
* ✅ Provides HAL JSON output
* ✅ Supports pagination, sorting, and links out of the box
* ✅ Extremely fast to build prototypes and simple APIs

---
## 🔁 How Spring Data REST Works Internally

```
Client
  ↓
Spring Data REST (auto-generated endpoints)
  ↓
JPA Repository
  ↓
Database
```

There is **no controller** and **no service**.
Everything is automatic.

---
## 👤 Author

**Dhanush Anil Kumar**

---
### 📸 Image Credit

Images used in this project are credited to **Chad Darby**.

---

