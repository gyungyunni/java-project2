package com.example.javaproject2.week2.day3;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInSchool classInSchool = new ClassInSchool();
        classInSchool.no = 1;
        classInSchool.teacher = new Teacher();
        classInSchool.teacher.name = "손흥민"; //손흥민의 축구 교실
        classInSchool.teacher.age = 32;
        classInSchool.teacher.address = "잉글랜드 런던시";

        classInSchool.students = new Student[30];
        classInSchool.students[0] = new Student();
        classInSchool.students[0].name = "이승우";
        classInSchool.students[1] = new Student();
        classInSchool.students[1].name = "김민재";

        System.out.printf("%d반 담임 선생님 성함은 %s입니다\n",classInSchool.no,classInSchool.teacher.name);
        System.out.printf("%d반 학생 이름은 %s, %s입니다",classInSchool.no, classInSchool.students[0].name,classInSchool.students[1].name);
    }
}
