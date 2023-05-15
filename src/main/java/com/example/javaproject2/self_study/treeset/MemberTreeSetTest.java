package com.example.javaproject2.self_study.treeset;

public class MemberTreeSetTest {

    public static void main(String[] args) {

        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberJay = new Member(1004, "제이팍");
        Member memberSon = new Member(1003, "손흥민");
        Member memberBts = new Member(1001, "bts");
        Member memberBong = new Member(1002, "봉준호");

        memberTreeSet.addMember(memberJay);
        memberTreeSet.addMember(memberSon);
        memberTreeSet.addMember(memberBts);
        memberTreeSet.addMember(memberBong);
        memberTreeSet.showAllMember();

    }
}
