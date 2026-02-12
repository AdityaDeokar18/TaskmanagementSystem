
package com.TaskmanagementSystem.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Attachment {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
 private String fileName;
 private String storagePath;
 private String uploadBy;
}
