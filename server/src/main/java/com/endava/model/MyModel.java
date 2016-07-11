package com.endava.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by rmilitaru on 7/5/2016.
 */
@Data
@Entity
public class MyModel {

    private @Id
    @GeneratedValue Long id;

    private String message;

    public MyModel() {
    }

    public MyModel(String s) {
        this.message=s;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
