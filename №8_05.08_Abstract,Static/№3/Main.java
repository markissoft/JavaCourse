package third;

import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
       Formatter formatter = new Formatter();
       System.out.println(formatter.format("%3.2e", Double.MAX_VALUE));
       System.out.println(formatter.format("%3.2e", Double.MIN_VALUE));

       System.out.println(formatter.format("%3.2e", Float.MAX_VALUE));
       System.out.println(formatter.format("%3.2e", Float.MIN_VALUE));
    }
}
