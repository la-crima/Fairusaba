package com.github.leaguelugas.formingi.entity.File;

import com.github.leaguelugas.formingi.service.file.FileType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class FileEntity {

    @Id
    private String id;

    @Column(nullable = false)
    private String fileName;

    @Column(nullable = false)
    private String fileExtension;

    @Enumerated(EnumType.STRING)
    private FileType fileType;

    @Column(nullable = false)
    private String filePath;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;
    
    public FileEntity updateFile(String fileName, String fileExtension) {
        this.fileName = fileName;
        this.fileExtension = fileExtension;
        return this;
    }

    public FileEntity deleteFile() {
        this.deletedAt = LocalDateTime.now();
        return this;
    }

}
