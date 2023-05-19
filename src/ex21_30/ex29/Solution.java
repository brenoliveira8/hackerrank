package ex21_30.ex29;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger number1 = scanner.nextBigInteger();
        BigInteger number2 = scanner.nextBigInteger();

        BigInteger sum = number1.add(number2);
        BigInteger mult = number1.multiply(number2);

        System.out.println(sum);
        System.out.println(mult);
    }
}
