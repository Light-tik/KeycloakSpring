package com.example.keycloakdemo;

public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }
}
