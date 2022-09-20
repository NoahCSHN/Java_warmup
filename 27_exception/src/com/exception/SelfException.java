package com.exception;

public class SelfException extends RuntimeException{
    public SelfException() {
        super();
    }

    public SelfException(String message, Throwable cause) {
        super(message, cause);
    }

    public SelfException(String message) {
        super(message);
    }

    public SelfException(Throwable cause) {
        super(cause);
    }
}

class UserLoginException extends SelfException{
    public UserLoginException() {
        super();
    }

    public UserLoginException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserLoginException(String message) {
        super(message);
    }

    public UserLoginException(Throwable cause) {
        super(cause);
    }
}

class UserNumTypeException extends SelfException{
    public UserNumTypeException() {
        super();
    }

    public UserNumTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNumTypeException(String message) {
        super(message);
    }

    public UserNumTypeException(Throwable cause) {
        super(cause);
    }
}