package strings;

public class Strings1 {
    //Получить символ по его номеру, а также номер символа в кодовой таблице UTF-8 (например, четвертый)
    public static void main(String[] args) {
        String s="Hello, world!";
        int n=4;
        char c = s.charAt(n);
        int numUTF = (int)c;
        System.out.println(s.charAt(n));
        System.out.println(numUTF);

    }
}
