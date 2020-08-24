package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            Scanner lineScanner = new Scanner(scanner.nextLine());
            List<Integer> list = new ArrayList<>();
            while (lineScanner.hasNextInt())
            {
                list.add(lineScanner.nextInt());
            }
        }
    }
}