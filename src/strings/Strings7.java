package strings;

public class Strings7 {
    //Удалить все скобки и буквы "а" из выражения
    public static void main(String[] args) {
        String s = "What are the {wrapper} {classes} in Java?";
        String s2;
        s2 = s.replaceAll("[{}a]", "");
        System.out.println(s2);
    }

}
