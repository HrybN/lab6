package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1, line2;
        System.out.println("Input first line");
        line1 = sc.nextLine();
        System.out.println("Input second line");
        line2 = sc.nextLine();

        int l1, l2;

        l1 = line1.length();
        l2 = line2.length();

        if(l1 > l2)
            System.out.println("The first line is larger");
        else if(l2 > l1)
            System.out.println("The second line is larger");
        else
            System.out.println("The lines are equal");
    }
}
