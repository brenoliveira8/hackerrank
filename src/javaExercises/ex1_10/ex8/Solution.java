package javaExercises.ex1_10.ex8;

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().trim());

        int intMax = ((int) Math.pow(2,31));
        System.out.println(intMax);
        int intMin = ((int) Math.pow(-2,31));
        System.out.println(intMin);
        for(int i = 0; i < t; i++){
            String s = bufferedReader.readLine().trim();
            try{
                var l = Long.parseLong(s);
                System.out.println(l + " can be fitted in:");
                if((l >= -128) && (l <= 127)){
                    System.out.println("* byte");
                }
                if((l >= -32768) && (l <= 32767)){
                    System.out.println("* short");
                }
                if((l >= intMin) && (l <= intMax)){
                    System.out.println("* int");
                }
                System.out.println("* long");
            }catch(NumberFormatException e){
                System.out.println(s + " can't be fitted anywhere.");
            }
        }
    }
}
