package project.taes_cloud.global.security.security.jwt.exception;

import project.taes_cloud.global.exception.error.exception.CustomException;
import project.taes_cloud.global.exception.error.exception.ErrorCode;

public class InvalidJwtException extends CustomException {

    public static final CustomException EXCEPTION = new InvalidJwtException();

    private InvalidJwtException() {
        super(ErrorCode.INVALID_TOKEN);
    }
}
