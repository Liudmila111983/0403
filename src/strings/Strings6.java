package strings;

public class Strings6 {
    //Заменить символ в строке (точку на вопросительный знак)
    public static void main(String[] args) {

        String s = "Why is garbage collection necessary in Java.";
        int pos = s.indexOf(".");
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(pos, '?');
        System.out.println(sb);
    }
}
