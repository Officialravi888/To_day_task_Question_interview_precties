package org.example;

public class Plandrom_progeam_number {
    public static void main(String[] args) {
        int num=123301, temp,revers=0;
        temp=num;
        while (temp!=0) {
            int remainder = temp % 10;
            revers = revers * 10 + remainder;
            temp = temp / 10;
        }
            if (num == revers)
                System.out.println("plandrom");
            else
                System.out.println("not plandrom");

    }
}
