package strings;

public class Stings2 {
    public static void main(String[] args) {
        String s;
        char c1 = '2', c2 = '\u00B7', c3 = '\u03C0', c4 = '=', c5 = '1',
                c6 = '8', c7 = '0', c8 = '\u00B0';
        s=""+c1+c2+c3+c4+c5+c6+c7+c8;
        System.out.println(s);

        //или так

        char[] arr={'2','\u00B7','\u03C0','=','1','8','0','\u00B0'};
        System.out.println(arr);
    }

}
