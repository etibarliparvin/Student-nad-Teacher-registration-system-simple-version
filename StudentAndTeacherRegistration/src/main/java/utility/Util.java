package utility;

import java.util.Scanner;

public class Util {

    public static Integer requireIntegerNumber(String text){
        System.out.print(text);
        return new Scanner(System.in).nextInt();
    }

    public static Double requireFloatNumber(String text){
        System.out.print(text);
        return new Scanner(System.in).nextDouble();
    }

    public static String requireText(String text){
        System.out.print(text);
        return new Scanner(System.in).nextLine();
    }
}
