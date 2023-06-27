package ibmTests.ex1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {
    public static List<Integer> subsetA(List<Integer> arr) {
        arr.sort((n1, n2) -> n2 - n1);
//        List<Integer> result = getA(arr).ad

        return getA(arr);

    }

    private static List<Integer> getA(List<Integer> arr){
        List<Integer> a = arr.subList(0, 2);
        int aSum = a.stream().mapToInt(Integer::intValue).sum();
        List<Integer> b = arr.subList(2, arr.size());
        int bSum = b.stream().mapToInt(Integer::intValue).sum();

        if(aSum > bSum){
            a.sort((n1, n2) -> n1 - n2);
            arr.remove(0);
            arr.remove(0);
//            List<Integer> result = subsetA(arr).addAll(a);
            return a;
        }

        return Collections.emptyList();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/dev/test.txt"));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.subsetA(arr);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}