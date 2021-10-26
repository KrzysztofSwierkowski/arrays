package com.company;

import java.security.SecureRandom;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();
        int[] data = generator.ints(100, 10, 100).toArray();

        

        for (int x:data
             ) {
            System.out.println(x);
        }

    }
}
