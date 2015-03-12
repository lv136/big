package com.softserve.edu;

public class Example {
    public static void main(String[] args) {
        System.out.println("My first program2");
        ILabel label = new Label();
        ((Label)label).check();
        Object obj=new Object();
        ((Label)obj).check();
    }
}