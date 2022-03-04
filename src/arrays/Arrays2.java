package arrays;

import java.util.Arrays;
import java.util.Random;

//Заполнить попорядку и сложить


public class Arrays2 {
    static int  size = 10;
    static int [] arr = new int[size];

    public static void main(String[] args) {
        fillOrder();
        System.out.println(Arrays.toString(arr));
        System.out.println(sum());

    }
    static void fillOrder(){
        //Заполнить массив попорядку. Например 1,2,....,10
        for (int i=1; i<=arr.length; i++)
            arr [i-1]=i;
           }

           static void fillRandom(){
               //Заполнить массив случайными двухзначными числами
               Random random = new Random();
               for (int i=1; i<=arr.length; i++)
                   arr[i-1] = random.nextInt(90)+10;



    }
    static int sum(){
        int sum = 0;
        for (int i=0; i<arr.length; i++)
            sum+=arr[i];
        return sum;
    }
}
