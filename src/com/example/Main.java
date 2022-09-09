package com.example;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random(123);
        Salesman salesman1 = new Salesman("Bob", random.nextInt(100000));
        Salesman salesman2 = new Salesman("Jeff", random.nextInt(100000));
        Salesman salesman3 = new Salesman("Adam", random.nextInt(100000));
        Salesman salesman4 = new Salesman("David", random.nextInt(100000));
        Salesman salesman5 = new Salesman("Wade", random.nextInt(100000));

        Salesman[] salesmen = {salesman1, salesman2, salesman3, salesman4, salesman5};

        System.out.println("Before sorting:");
        for (Salesman s : salesmen){
            System.out.println(s.getName() + ": " + s.getSalesTotal());
        }
        System.out.println();


        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < salesmen.length-1; i++) {
                if (salesmen[i].getSalesTotal() > salesmen[i + 1].getSalesTotal()) {
                    Salesman temp = salesmen[i];
                    salesmen[i] = salesmen[i + 1];
                    salesmen[i + 1] = temp;
                }

            }
        }
        System.out.println("After sorting:");
        for (int i = salesmen.length-1; i >= 0; i--){
            System.out.println(salesmen[i].getName() + ": " + salesmen[i].getSalesTotal());
        }
    }
}
