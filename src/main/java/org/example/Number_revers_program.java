package org.example;

public class Number_revers_program {
    public static void main(String[] args) {
     int num=123, revers=0;
     while (num!=0) {
         int remainder = num % 10;
         revers = revers * 10 + remainder;
         num = num / 10;
     }
         System.out.println(revers);


    }

}
