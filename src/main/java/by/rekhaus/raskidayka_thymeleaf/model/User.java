package by.rekhaus.raskidayka_thymeleaf.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name = "users")
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "email")
    private String email;
    @Column (name = "first_name")
    private String first_name;
    @Column (name = "last_name")
    private String last_name;
    @Column (name = "password")
    private String password;
    @Enumerated (value = EnumType.STRING)
    @Column (name = "role")
    private Role role;
    @Enumerated (value = EnumType.STRING)
    @Column (name = "status")
    private Status status;

    public User() {
    }

    public User(String email, String first_name, String last_name, String password) {
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
    }
}