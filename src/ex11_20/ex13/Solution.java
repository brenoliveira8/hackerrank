package ex11_20.ex13;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        var payment = scanner.nextDouble();
        scanner.close();

        var u = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        var i = NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment);
        var c = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        var f = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + u);
        System.out.println("India: " + i);
        System.out.println("China: " + c);
        System.out.println("France: " + f);

    }
}
