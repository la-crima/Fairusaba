package com.github.leaguelugas.formingi.controller;

import com.github.leaguelugas.formingi.service.file.FileService;
import com.github.leaguelugas.formingi.service.file.FileType;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RequiredArgsConstructor
@RestController
public class FileController {

    private final FileService fileService;

    @GetMapping({"/file", "/image"})
    public ResponseEntity<Resource> loadFile(@RequestParam String id) {
        return fileService.loadFile(id);
    }

    @PostMapping({"/file", "/image"})
    @ResponseStatus(HttpStatus.CREATED)
    public void uploadFile(@RequestParam String fileName,
                           @RequestParam String fileExtension,
                           @RequestParam MultipartFile file) {
        fileService.uploadFile(fileName, fileExtension, FileType.FILE, file);
    }

    @PutMapping("/file")
    public void updateFile(@RequestParam String id,
                           @RequestParam String fileName,
                           @RequestParam String fileExtension,
                           @RequestParam MultipartFile changedFile) {
        fileService.updateFile(id, fileName, fileExtension, changedFile);
    }

    @DeleteMapping({"/file", "/image"})
    public void deleteFile(@RequestParam String id) {
        fileService.deleteFile(id);
    }

}
