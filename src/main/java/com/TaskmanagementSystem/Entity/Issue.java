
package com.TaskmanagementSystem.Entity;

import jakarta.persistence.*;
import lombok.*;
import com.TaskmanagementSystem.Enum.*;

@Entity
@Data
public class Issue {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
 private String issueKey;
 private String issueTitle;
 @Enumerated(EnumType.STRING)
 private IssueType issueType;
 @Enumerated(EnumType.STRING)
 private IssueStatus status;
}
