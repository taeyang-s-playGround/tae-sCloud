package project.taes_cloud.domain.auth.exception;

import project.taes_cloud.global.security.config.error.exception.CustomException;
import project.taes_cloud.global.security.config.error.exception.ErrorCode;

public class AccountIdAlreadyExistsException extends CustomException {

    public static final CustomException EXCEPTION = new AccountIdAlreadyExistsException();

    public AccountIdAlreadyExistsException() {
        super(ErrorCode.ACCOUNT_ID_ALREADY_EXISTS);
    }
}
