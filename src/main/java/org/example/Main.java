package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = Sum(false,0,0);
        System.out.println(i);
    }

//    public static int Sum(int a, int b){
//        return (a + b);
//    }

    public static int Sum(boolean isTest, int a, int b){
        if(isTest){
            return (a + b);
        }
        else {
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            int y = in.nextInt();
            return (x + y);
        }
    }

}

