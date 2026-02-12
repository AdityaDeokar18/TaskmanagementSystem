
package com.TaskmanagementSystem.Entity;

import jakarta.persistence.*;
import lombok.*;
import com.TaskmanagementSystem.Enum.Role;

@Entity
@Data
public class UserAuthenticate {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
 private String userName;
 private String userOfficialEmail;
 private String password;
 @Enumerated(EnumType.STRING)
 private Role role;
}
