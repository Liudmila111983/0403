package com.company;

public class Methods2 {
    public static void main(String[] args) {
        System.out.println(isEven(2));

    }
    //является ли число четным
    static boolean isEven(int n){
        if (n%2==0) return true;
        else return false;
    }
}
