
package com.TaskmanagementSystem.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.TaskmanagementSystem.Entity.Attachment;

@Service
public class AttachmentService {
 public Attachment uploadFile(Long issueId, MultipartFile file, String uploadBy) {
   Attachment a = new Attachment();
   a.setFileName(file.getOriginalFilename());
   a.setStoragePath("http://dummyurl.com/" + file.getOriginalFilename());
   a.setUploadBy(uploadBy);
   return a;
 }
 public Attachment getFileById(Long id) {
   return new Attachment();
 }
}
