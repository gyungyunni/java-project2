package com.example.javaproject2.week4.day4.codeup;

import java.io.*;
import java.util.*;

class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id, o.id);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
public class CodeUp3108OOP {
    private List<Student> studentList = new ArrayList<>();

    public void insertId(int id, String name) {
        Student st = new Student(id, name);
        if(!containsInsert(st)) studentList.add(st);
    }
    public void deleteId(int id, String name) {
        Student st = new Student(id, name);
        studentList.removeIf(student -> student.equals(st));
    }
    public boolean containsInsert(Student student) { // 값이 있으면 true 반환
        for(Student st : studentList) {
            if(student.getName().equals(st.getName()) || student.getId() == st.getId()) {
                return true;
            }
        }
        return false;
    }
    public boolean containsDelete(Student student) {
        for(Student st : studentList) {
            if(student.getId() == st.getId()) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNum = Integer.parseInt(br.readLine());

        CodeUp3108OOP solution = new CodeUp3108OOP();
        for(int i = 0; i < caseNum; i++) {
            String[] input = br.readLine().split(" ");
            if(input[0].equals("I")) {
                solution.insertId(Integer.parseInt(input[1]), input[2]);
            } else {
                solution.deleteId(Integer.parseInt(input[1]), input[2]);
            }
        }

        solution.studentList.sort(Comparator.naturalOrder());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = st.countTokens();
        for(int i = 0; i < n; i++) {
            int idx = Integer.parseInt(st.nextToken()) - 1;
            bw.write(solution.studentList.get(idx).getId() + " " + solution.studentList.get(idx).getName() + "\n");
        }
        bw.close();
    }
}