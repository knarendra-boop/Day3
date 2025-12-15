package org.example;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4);
        List<Integer> even = nums.stream()
                .filter(n -> n%2==0)
                .toList();
        System.out.print(even);

    }
}
