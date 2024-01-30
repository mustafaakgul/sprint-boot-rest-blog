package org.project.springbootblog.exception;

public class UserNowFoundException extends RuntimeException{

    public UserNowFoundException(long id) {
        super("User id not found : " + id);
    }
}
