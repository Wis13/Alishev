package com.vadym.code;

import java.sql.SQLOutput;
import java.util.Stack;

public class Test2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(3);
        stack.push(1);

       while (!stack.empty()) {
           System.out.println(stack.pop());
       }

    }
}
