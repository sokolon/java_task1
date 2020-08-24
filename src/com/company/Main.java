package com.company;

import java.util.*;

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

            int count = list.size();
            Set<Integer> distList = new HashSet<>(list);
            int distinct = distList.size();
            list = new ArrayList<>(distList);
            Collections.sort(list);
            int min = list.get(0);
            int max = list.get(list.size()-1);


            list.forEach((ele) -> {
                System.out.print(ele + " ");
            });
            System.out.println();

            System.out.println("count: " + count);
            System.out.println("distinct: " + distinct);
            System.out.println("min: " + min);
            System.out.println("max: " + max);
        }
    }
}