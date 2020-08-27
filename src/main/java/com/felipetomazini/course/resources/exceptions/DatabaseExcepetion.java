package com.felipetomazini.course.resources.exceptions;

public class DatabaseExcepetion extends RuntimeException{

    public DatabaseExcepetion(String msg){
        super(msg);
    }
}
