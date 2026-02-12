
package com.TaskmanagementSystem.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.core.io.*;
import org.springframework.web.multipart.MultipartFile;
import com.TaskmanagementSystem.Service.AttachmentService;
import com.TaskmanagementSystem.Entity.Attachment;
import java.net.URL;

@RestController
@RequestMapping("/api/attachments")
public class AttachmentController {

 @Autowired
 private AttachmentService attachmentService;

 @PostMapping("/uploadFile/{issueId}")
 public ResponseEntity<Attachment> upload(@PathVariable Long issueId,
     @RequestParam MultipartFile file,
     @RequestParam String uploadBy) throws Exception {
   return ResponseEntity.ok(attachmentService.uploadFile(issueId, file, uploadBy));
 }

 @GetMapping("/downloadFile/stream/{id}")
 public ResponseEntity<Resource> stream(@PathVariable Long id) throws Exception {
   Attachment attach = attachmentService.getFileById(id);
   URL url = new URL(attach.getStoragePath());
   return ResponseEntity.ok().body(new InputStreamResource(url.openStream()));
 }
}
