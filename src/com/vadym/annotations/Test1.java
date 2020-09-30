package com.vadym.annotations;

public class Test1 {
    @MethodInfo(purpose = "Print Hello World")
    public void printHelloWorld() {
        System.out.println("Hello World!");
    }
}
