package com.company;

import java.math.BigInteger;
import java.util.*;

public class Main {

    public static int zeros(int n) {


        BigInteger fact = BigInteger.valueOf(1);
        int zeroCounter = 0;

        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        String factAsString = String.valueOf(fact);

        for (int i = factAsString.length() - 1; i >= 0; i--) {
            if (factAsString.charAt(i) != '0') {
                break;
            }
            zeroCounter++;
        }

        return zeroCounter;

    }

}

class Circle {

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public int getArea() {
        return (int) Math.ceil(Math.PI * radius * radius);
    }

}

class Rectangle {

    private float width;
    private float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return (int) Math.ceil(width * height);
    }
}

class Square {

    private float width;

    public Square(float width) {
        this.width = width;
    }

    public int getArea() {
        return (int) Math.ceil(width * width);
    }
}





abstract class Testing {

    private int val;

    public Testing(int val) {
        this.val = val;
    }

    abstract void doSomething(int val);

    public void doSomethingElse(int val) {

    }

}

class Parent {

    public static void foo() {
        System.out.println("I am foo in Super");
    }

    public void bar() {
        System.out.println("I am bar in Super");
    }
}

class Child extends Parent {

    public static void foo() {
        System.out.println("I am foo in Child");
    }

    public void bar() {
        System.out.println("I am bar in Child");
    }

    public static void main(String[] args) {

        Parent par = new Child();
        Child child = new Child();
        par.foo();
        child.foo();

        par.bar();
        child.bar();
    }

}