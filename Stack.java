package com.BridgeLabz.Stack;

import java.util.LinkedList;

public class Stack<T> {
    LinkedList<T> linkedList = new LinkedList<T>();

    public void add(T data){
        linkedList.add(data);
    }
    public  void show(){
        linkedList.show();
    }
    public void pop(T data){

        linkedList.DeleteLastElement(data);
    }
}
