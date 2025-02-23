package com.mindsprint.project1.oops;

import java.util.Scanner;

interface PaymentMethod{
    public void pay();
}

class RazorPay implements PaymentMethod{
    public void pay(){
        System.out.println("Payment done using RazorPay");
    }
}

class PayPal implements PaymentMethod{
    public void pay(){
        System.out.println("Payment done using PayPal");
    }
}

public class Payment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your Payment Method");
        String method = sc.next();
        PaymentMethod rm = null;
        if(method.equals("PayPal")) {
            rm = new PayPal();
        }
        else {
            rm = new RazorPay();
        }
            rm.pay();
    }
}
