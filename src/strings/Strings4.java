package strings;

public class Strings4 {
    //Все ли символы в строке являются числами
    public static void main(String[] args) {
        //int - ему соответствует класс Integer; char - Character

        String s;
        s="123s";
        boolean flag = true;
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (!Character.isDigit(c)) flag = false;
        }
        System.out.println(flag);
    }
}
