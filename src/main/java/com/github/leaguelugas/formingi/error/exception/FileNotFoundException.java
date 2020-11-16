package com.github.leaguelugas.formingi.error.exception;

import com.github.leaguelugas.formingi.error.BusinessException;
import com.github.leaguelugas.formingi.error.ErrorCode;

public class FileNotFoundException extends BusinessException {
    public FileNotFoundException() {
        super(ErrorCode.FILE_NOT_FOUND);
    }
}
