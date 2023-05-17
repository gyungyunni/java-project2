package com.example.javaproject2.week5.day3;

import java.util.EmptyStackException;

public class Stack1 {
    private int[] arr = new int[100000];

    private int pointer = 0;
    public void push(int value){
        this.arr[pointer++] = value;
    }
    public boolean isEmpty(){
        return this.pointer ==0;
    }
    public int pop() {
        if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        return this.arr[--pointer];
    }
    public int peek() {
        if (isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        return arr[pointer-1];
    }

    public static void main(String[] args) {
        Stack1 st = new Stack1();
        System.out.println(st.peek());

    }
}
