# 🚀 Hibernate Many-to-Many Relationship Example  

This repository contains a **Hibernate Many-to-Many Relationship** implementation using Java and JPA annotations. The project demonstrates how to map a **many-to-many relationship** in Hibernate with different approaches, including bidirectional relationships and a join table.  

## ✨ Features  
- 🔗 **Many-to-Many** mapping using `@ManyToMany` and `@JoinTable`  
- 🔄 **Bidirectional Many-to-Many** mapping with `mappedBy`  
- 🛠 **Uses Hibernate ORM** with **MySQL/Jakarta Persistence API**  
- 📌 **Lombok integration** to reduce boilerplate code  
- 📚 **Clear, simple, and practical examples** for easy understanding  

## 🛠 Technologies Used  
- ☕ **Java 11+**  
- 🏗 **Hibernate ORM**  
- 📦 **Jakarta Persistence API (JPA)**  
- 🗄 **MySQL**  
- ✍️ **Lombok**  
- 📝 **Maven** (for dependency management)  
- 💻 **IntelliJ IDEA / VS Code**  

## 🏃‍♂️ How to Run  

1. 📥 **Clone the repository**  
   ```sh
   git clone https://github.com/Matheesha-Abiman/hibernate-many-to-many-example.git
   cd hibernate-many-to-many-example
   ```  
2. ⚙️ **Configure Database** (Edit `hibernate.cfg.xml` with your MySQL credentials)  
3. 🚀 **Build and Run the project**  
   ```sh
   mvn clean install
   mvn exec:java -Dexec.mainClass="com.example.MainApplication"
   ```  

## 📝 Example Code  

### 🏗 **1. Entity Classes**  

#### 🎓 **Student.java**  
```java
@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany
    @JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;
}
```  

#### 📚 **Course.java**  
```java
@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;
}
```  

## 🎯 Additional Notes  
- The `@ManyToMany` annotation is used for both **Student** and **Course** entities.  
- The `@JoinTable` annotation creates the **student_course** join table.  
- The `mappedBy` attribute is used to make the relationship **bidirectional**.  

## 🤝 Contributing  
Feel free to fork this repository and submit pull requests with improvements! 🎯  
