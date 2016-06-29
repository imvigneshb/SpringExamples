/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Example1;

/**
 *
 * @author vigneshwaran.b
 */
public class Triangle {

    private String message;

    /**
     *
     */
    public Triangle() {
    }

    private String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     */
    public void draw() {
        System.out.println("Triangle drawn with message : " + getMessage());
    }
}
