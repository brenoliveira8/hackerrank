package javaExercises.ex11_20.ex19;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        s = s.replaceAll("!", " ")
                .replaceAll(",", " ")
                .replaceAll("\\?", " ")
                .replaceAll("\\.", " ")
                .replaceAll("@", " ")
                .replaceAll("_", " ")
                .replaceAll("\\{", " ")
                .replaceAll("}", " ")
                .replaceAll("\\[", " ")
                .replaceAll("]", " ")
                .replaceAll("\\(", " ")
                .replaceAll("\\)", " ")
                .replaceAll("'", " ");

        String[] tokens = s.split(" ");

        var tokensWithoutSpace = Arrays.stream(tokens).filter(a -> !a.isBlank()).collect(Collectors.toList());
        System.out.println(tokensWithoutSpace.size());
        tokensWithoutSpace.forEach(System.out::println);
    }
}
