package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, d1;
        int n2, d2;
        int n3, d3;

        System.out.println("Введіть чисельник першого числа: ");
        n1 = sc.nextInt();
        System.out.println("Введіть знаменник першого числа: ");
        d1 = sc.nextInt();
        System.out.println("Введіть чисельник другого числа: ");
        n2 = sc.nextInt();
        System.out.println("Введіть знаменник другого числа: ");
        d2 = sc.nextInt();
        System.out.println("Введіть чисельник третього числа: ");
        n3 = sc.nextInt();
        System.out.println("Введіть знаменник третього числа: ");
        d3 = sc.nextInt();

        int num1, num2, num3;

        if(d1 == 0 || d2 == 0 || d3 == 0) {
            System.out.println("0 не може бути в знаменнику!!!");
        }

        num1 = n1/d1;
        num2 = n2/d2;
        num3 = n3/d3;

        if (num1 > num2 && num1 > num3) {
            System.out.println("Найбільшим є перший дріб");
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println("Найбільшим є другий дріб");
        }
        if (num3 > num1 && num3 > num2) {
            System.out.println("Найбільшим є перший дріб");
        }
    }
}
