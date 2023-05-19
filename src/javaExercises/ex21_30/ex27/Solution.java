package javaExercises.ex21_30.ex27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        BigInteger number = new BigInteger(n);

        boolean probablePrime = number.isProbablePrime(10);

        if(probablePrime)
            System.out.println("prime");
        else
            System.out.println("not prime");

        bufferedReader.close();
    }
}
