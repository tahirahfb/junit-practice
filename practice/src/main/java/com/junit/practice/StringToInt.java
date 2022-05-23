package com.junit.practice;

public class StringToInt {
    static String num1 = "49";
    public static void main(String[] args){

        System.out.println(num1);
        System.out.println(newNum());
    }

    public static Integer newNum(){
        int num2 = Integer.parseInt(num1);
        return num2;
    }
    
}
