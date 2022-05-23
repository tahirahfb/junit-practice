package com.junit.practice;

public class Vacation {
    public static void main(String[] args){
        System.out.println(visit());
        System.out.println(visitCity());
        System.out.println(visitCountry());
    }

    public static String visit(){
        return "I'd like to visit";
    }

    public static String visitCity(){
        return "Dakar";
    }

    public static String visitCountry(){
        return "Senegal";
    }
}
