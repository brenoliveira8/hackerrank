package javaExercises.ex51_60.ex52;

import java.util.Scanner;
import java.lang.reflect.Constructor;

class Singleton {
    private Singleton() {}
    public String str;
    private static Singleton instance = null;
    public static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Singleton single = Singleton.getSingleInstance();

        single.str = sc.nextLine();

        System.out.println("Hello I am a singleton! Let me say " + single.str + " to you");
    }
}
