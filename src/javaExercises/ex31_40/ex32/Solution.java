package javaExercises.ex31_40.ex32;

import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }

        int negativeCounter = 0;
        for(int i = 0; i < n; i++){
            if(a[i] < 0){
                negativeCounter++;
            }
            int sum = a[i];
            for(int j = i + 1; j < n; j++){
                sum = sum + a[j];
                if(sum < 0){
                    negativeCounter++;
                }
            }
        }

        System.out.println(negativeCounter);
    }
}
