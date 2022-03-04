package arrays;

import java.util.Arrays;
import java.util.Random;

public class Arrays1 {
    public static void main(String[] args) {
        int  size = 10;
        int [] arr = new int[size];
        System.out.println(Arrays.toString(arr));

        //Заполнить массив попорядку. Например 1,2,....,10
        for (int i=1; i<=10; i++)
        arr [i-1]=i;
        System.out.println(Arrays.toString(arr));

        //Заполнить массив случайными двухзначными числами
        Random random = new Random();
        for (int i=1; i<=arr.length; i++)
            arr[i-1] = random.nextInt(90)+10;
        System.out.println(Arrays.toString(arr));

        }
}
