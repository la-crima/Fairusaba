package com.github.leaguelugas.formingi.error;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@Getter
@AllArgsConstructor
public enum  ErrorCode {

    FILE_NOT_FOUND(404, "File Not Found"),
    FILE_EXTENSION_NOT_ALLOWED(400, "File Extension Not Allowed");

    private final Integer status;
    private final String message;

}
