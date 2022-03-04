public class Methods {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    /*
    (Вычислим факториал) 1!=1; 2!=2; 3!=6; 4!=24;
     */

    static int factorial(int n){
        int result = 1;
        for (int i=1; i<=n; i++)
        result*=i;
        return result;
    }
}
