package org.example;

public class Cat {
    private String name;
    private int age;
    private String color;

    @RunImmediately //put this annotation here to invoke this method immediately
    public void meow(){
        System.out.println("MEOW");
    }

    public void eat(){
        System.out.println("MUNCH");
    }

}
