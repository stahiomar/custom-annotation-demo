package org.example;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        //Create object of cat class
        Cat myCat = new Cat();

        //loop through methods inside muCat object and invoke the method annotated with @RunImmediately
        for (Method method : myCat.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                method.invoke(myCat);
            }
        }

    }
}