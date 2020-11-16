package com.github.leaguelugas.formingi.error.exception;

import com.github.leaguelugas.formingi.error.BusinessException;
import com.github.leaguelugas.formingi.error.ErrorCode;

public class FileExtensionNotAllowedException extends BusinessException {
    public FileExtensionNotAllowedException() {
        super(ErrorCode.FILE_EXTENSION_NOT_ALLOWED);
    }
}
