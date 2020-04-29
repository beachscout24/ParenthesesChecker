package com.availity.impl;

import java.util.Stack;

public class Parentheses_Checker {
    public static void main(String[] args) {
        System.out.println(isClosedAndNested("() ( ( ) ) )"));
        System.out.println(isClosedAndNested("( ( ( ) )"));
        System.out.println(isClosedAndNested("( ( () () ) )"));
        System.out.println(isClosedAndNested("( ( () () ) )"));
        System.out.println(isClosedAndNested(""));
    }


    private static Boolean isClosedAndNested(String code) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '(') {
                stack.push(code.charAt(i));
            }
            if (code.charAt(i) == ')') {
                if (stack.empty()) {
                    return false;
                }
                Character lastChar = stack.pop();

                if (lastChar == '(' && code.charAt(i) != ')') {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}

