package project.taes_cloud.domain.user.exception;


import project.taes_cloud.global.security.config.error.exception.CustomException;
import project.taes_cloud.global.security.config.error.exception.ErrorCode;

public class UserAlreadyExistsException extends CustomException {
    public static final CustomException EXCEPTION = new UserAlreadyExistsException();

    private UserAlreadyExistsException() {
        super(ErrorCode.USER_ALREADY_EXISTS);
    }
}
