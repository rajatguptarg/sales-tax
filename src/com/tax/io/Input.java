package com.tax.io;

import java.util.Scanner;

public class Input {
    Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getInput() {
        return scanner.nextLine();
    }
}
