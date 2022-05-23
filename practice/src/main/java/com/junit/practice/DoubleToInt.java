package com.junit.practice;

public class DoubleToInt {
    static double num1 = 112.35;
    
    public static void main(String[] args) throws Exception {

        System.out.println(num1);
        System.out.println(newNum());
    }

    public static Integer newNum(){
        int num2 = (int)num1;
        return num2;
    }
}
