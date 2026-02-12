
package com.TaskmanagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.TaskmanagementSystem.Entity.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {}
