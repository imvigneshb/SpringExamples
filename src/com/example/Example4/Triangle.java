/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Example4;

/**
 *
 * @author vigneshwaran.b
 */
public class Triangle {

    private Point pointA;

    public Triangle() {
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void draw() {
        System.out.println("Triangle drawn at the point of X = " + pointA.getX() + " And Y = " + pointA.getY());
    }
}
