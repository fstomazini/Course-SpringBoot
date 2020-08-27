package com.felipetomazini.course.service.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Object id){
        super("Resource note Found. id: " + id);
    }



}
