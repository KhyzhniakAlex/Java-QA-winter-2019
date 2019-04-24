package com.epam.javaQA.homework.Exceptions;

public class ValidationException extends Exception {

    private String message;

    public ValidationException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
