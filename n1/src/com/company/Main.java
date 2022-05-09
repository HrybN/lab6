package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w1, w2, w3, w4, w5;
        w1 = sc.nextLine();
        w2 = sc.nextLine();
        w3 = sc.nextLine();
        w4 = sc.nextLine();
        w5 = sc.nextLine();

        String words = w1.concat(w2.concat(w3.concat(w4.concat(w5))));
        System.out.println(words);
    }
}
