package com.epam.java.lab.Exception;

public class SideException extends Throwable {

    private String message;

    public SideException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
