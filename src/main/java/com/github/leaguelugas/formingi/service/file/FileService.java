package com.github.leaguelugas.formingi.service.file;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {
    ResponseEntity<Resource> loadFile(String id);
    void uploadFile(String fileName, String fileExtension, FileType fileType, MultipartFile file);
    void updateFile(String id, String fileName, String fileExtension, MultipartFile changedFile);
    void deleteFile(String id);
}
