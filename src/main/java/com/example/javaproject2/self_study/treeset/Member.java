package com.example.javaproject2.self_study.treeset;

import java.util.Comparator;

public class Member implements Comparator<Member> {

    private int memberId;        //회원 아이디
    private String memberName;   //회원 이름

    public Member() {}
    public Member(int memberId, String memberName){ //생성자
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString(){   //toString 메소드 오버로딩
        return memberName + " 회원님의 아이디는 " + memberId + "입니다";
    }

    /*
    public int compareTo(Member member) {
        //return (this.memberId - member.memberId);   //오름차순
        return (this.memberId - member.memberId) *  (-1);   //내림 차순
    }

     */
    @Override
    public int compare(Member member1, Member member2) {
        return (member1.memberId - member2.memberId);
    }

}
