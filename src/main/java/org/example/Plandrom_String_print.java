package org.example;

public class Plandrom_String_print {
    public static void main(String[] args) {
        String str="rar";
        String revers="";
        for (int i=str.length()-1; i>=0; i--){
            revers=revers+str.charAt(i);
        }
        if (str.equals(revers)) {
            System.out.println(str+":plandrom");
        } else
            System.out.println(str+":not plandrom");
    }
}
