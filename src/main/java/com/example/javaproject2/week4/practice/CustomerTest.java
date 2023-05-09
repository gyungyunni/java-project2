package com.example.javaproject2.week4.practice;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customer1 = new Customer(10010, "제니");
        customer1.bonusPoint = 1000;
        System.out.println(customer1.showCustomerInfo());

        VIPCustomer customer2 = new VIPCustomer(10020, "카리나");
        customer2.bonusPoint = 10000;
        System.out.println(customer2.showCustomerInfo());

    }
}

