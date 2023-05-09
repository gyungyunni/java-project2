package com.example.javaproject2.week4.practice;

public class VIPCustomer extends Customer{

    private int agentID;
    double salesRatio;

    // super를 이용하여 상위 클래스의 생성자 명시적으로 호출
    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        System.out.println("VIPCustomer(int, String) 생성자 호출");
    }


    public int getAgentID() {
        return agentID;
    }
}
