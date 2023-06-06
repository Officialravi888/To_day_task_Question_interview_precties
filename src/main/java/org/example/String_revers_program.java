package org.example;

public class String_revers_program {
    public static void main(String[] args) {
        String str="Ravikant";
        for (int i=str.length()-1; i>=0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}