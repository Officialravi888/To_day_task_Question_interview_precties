package org.example;

public class fibnocci_number_print {
    public static void main(String[] args) {
        int a=0,b=1,temp;
        System.out.println(a+":"+b);
        for (int i=1; i<=5; i++){
            temp=a+b;
            a=b;
            b=temp;
            System.out.println(b);
        }
    }
}
