package com.github.leaguelugas.formingi.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorResponse {

    private final Integer status;
    private final String message;

}
