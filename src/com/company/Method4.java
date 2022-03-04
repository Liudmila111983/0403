package com.company;

import java.util.Arrays;

public class Method4 {
    //Заданы два числа. Переставить их местами
    public static void main(String[] args) {
        int a=1, b=2;
        int[] result = swap(a,b);
        System.out.println(Arrays.toString(result));

        //Вместо Swap
        //int temp;
        //temp = a; a=b; b=temp;
        //System.out.printf("a=%d, b=%d", a,b);
        //или так
        //int temp;
        //temp = a; a=b; b=temp;
        //System.out.println("a="+a+", b="+b);

    }
    static int[] swap(int a, int b){
        int temp;
        temp = a; a=b; b=temp;
        int[] result = new int[2];
        result[0] = a;
        result[1] = b;
        return result;
    }

}
