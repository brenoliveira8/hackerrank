package javaExercises.ex31_40.ex33;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        ArrayList<ArrayList<Integer>> numbers = new ArrayList<>(lines);
        for(int i = 0; i < lines; i++){
            int qtd = scanner.nextInt();
            ArrayList<Integer> newLineNumbers = new ArrayList<>(qtd);
            if(qtd > 0){
                for(int j = 0; j < qtd; j++){
                    newLineNumbers.add(scanner.nextInt());
                }
            }
            numbers.add(newLineNumbers);
        }

        int queries = scanner.nextInt();
        for(int i = 0; i < queries; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            try{
                System.out.println(numbers.get(x - 1).get(y - 1));
            }catch(IndexOutOfBoundsException exception){
                System.out.println("ERROR!");
            }
        }

    }
}
