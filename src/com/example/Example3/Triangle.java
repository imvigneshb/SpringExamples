/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Example3;

/**
 *
 * @author vigneshwaran.b
 */
public class Triangle {

    private String type;
    private int height;

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }

    public void draw() {
        System.out.println(getType() + " Triangle drawn at height = " + getHeight());
    }
}
