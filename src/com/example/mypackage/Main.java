package com.example.mypackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        X x = new X(scanner.nextInt());
        x.x();
    }
}
