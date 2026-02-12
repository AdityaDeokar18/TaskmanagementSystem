
package com.TaskmanagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.TaskmanagementSystem.Entity.Issue;

public interface IssueRepository extends JpaRepository<Issue, Long> {}
