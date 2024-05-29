package com.codewithprojects.entity;


import com.codewithprojects.enums.UserRole;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private UserRole userRole;

}
