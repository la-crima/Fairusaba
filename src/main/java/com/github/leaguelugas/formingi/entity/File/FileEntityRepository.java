package com.github.leaguelugas.formingi.entity.File;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileEntityRepository extends CrudRepository<FileEntity, String> {
}
