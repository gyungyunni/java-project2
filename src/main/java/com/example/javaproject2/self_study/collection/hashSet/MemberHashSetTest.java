package com.example.javaproject2.self_study.collection.hashSet;

public class MemberHashSetTest {

    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberIron = new Member(1001, "아이언맨");
        Member memberThor = new Member(1002, "토르");
        Member memberCap = new Member(1003, "캡틴아메리카");


        memberHashSet.addMember(memberIron);
        memberHashSet.addMember(memberThor);
        memberHashSet.addMember(memberCap);
        memberHashSet.showAllMember();

        Member memberBlack = new Member(1003, "블랙위도우");  //1003 아이디 중복
        memberHashSet.addMember(memberBlack);
        memberHashSet.showAllMember();
    }
}
