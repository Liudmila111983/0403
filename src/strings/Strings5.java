package strings;

public class Strings5 {
    //Является ли числом хотя бы один символ
    public static void main(String[] args) {

        String s;
        s="123s";
        boolean flag = false;
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (!Character.isDigit(c)) flag = true;
        }
        System.out.println(flag);
    }
}
