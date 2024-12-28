package org.example;

public class Cat {
    private String name;
    private int age;
    private String color;

    @RunImmediately
    public void meow(){
        System.out.println("MEOW");
    }

    public void eat(){
        System.out.println("MUNCH");
    }

}
