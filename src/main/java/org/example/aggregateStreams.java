package org.example;

import java.util.Arrays;
import java.util.List;

public class aggregateStreams {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3);
        int min  = li.stream()
                .mapToInt(n->n)
                .min()
                .getAsInt();
        System.out.print(min);


        List<Integer> li1 = Arrays.asList(2,3,44);
        long max = li1.stream()
                .mapToInt(n->n)
                .max()
                .getAsInt();
        System.out.print(max);
    }
}

