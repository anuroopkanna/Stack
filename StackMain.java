package com.BridgeLabz.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(11);
        stack.add(12);
        stack.add(13);
        stack.add(14);
        stack.show();
        stack.pop(14);
    }
}
