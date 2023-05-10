package com.example.javaproject2.week4.day2practice;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new DeskTop();
        computer.display();
        computer.turnOff();

        NoteBook myNote = new MyNoteBook();
    }
}