package com.codewithprojects.dto;


import com.codewithprojects.enums.UserRole;
import lombok.Data;

import javax.persistence.*;
@Data

public class UserDto {

    private Long id;
    private String name;
    private String email;
    private String password;
    private UserRole userRole;

}
