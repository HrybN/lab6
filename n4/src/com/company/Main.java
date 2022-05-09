package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1, name2;

        System.out.println("Input first name: ");
        name1 = sc.nextLine();
        System.out.println("Input second name: ");
        name2 = sc.nextLine();

        if(name1.equalsIgnoreCase(name2))
            System.out.println("These names is the same");
        else
            System.out.println("These names is not the same");
    }
}
