package ex21_30.ex30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int[] list = new int[n];
        for(int i = 0; i < n; i++){
            list[i] = Integer.parseInt(bufferedReader.readLine().replaceAll("\\s+$", ""));
        }
        for(int i : list){
            System.out.println(i);
        }

        bufferedReader.close();
    }
}
