package javaExercises.ex41_50.ex49;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println(x / y);
        }catch(InputMismatchException exception){
            System.out.println(exception.getClass().getCanonicalName());
        }catch(ArithmeticException exception){
            System.out.println(exception.toString());
        }

        scanner.close();
    }
}
