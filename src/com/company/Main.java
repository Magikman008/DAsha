package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int count = 0;
	    int a[] = new int[len];

        for (int i = 0; i != len; i++) { a[i] = scan.nextInt(); }

        for (int j = len - 1; j >= 1; j--) {

            for (int i = 1; i < len; i++) {
                if (a[i - 1] > a[i]) {
                    int tmp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = tmp;
                    count++;
                }
            }
        }

        System.out.print(count);

    }
}
