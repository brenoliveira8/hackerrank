package javaExercises.ex21_30.ex28;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution{
    public static void main(String[] argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map<String, Integer> map = new HashMap();

        for(int i = 0; i < n; i++){
            String name = in.nextLine();
            Integer phone = in.nextInt();
            map.put(name, phone);
            in.nextLine();
        }

        while(in.hasNext()){
            String s = in.nextLine();
            if(map.get(s) == null)
                System.out.println("Not found");
            else
                System.out.println(s + "=" + map.get(s));
        }
    }
}
