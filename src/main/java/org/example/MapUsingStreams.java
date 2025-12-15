package org.example;

import java.util.Map;

public class MapUsingStreams {

    public static void main(String[] args) {
Map<Integer, String> map = Map.of(1, "suresh",
                                 2,"ramesh");

System.out.print("printing keys");
map.keySet().stream()
        .forEach(key->System.out.print(key));

map.values().stream()
        .forEach(values-> System.out.print(values));

map.entrySet().stream()
        .forEach(entry -> System.out.print(entry.getKey() + " " + entry.getValue()));
    }

}
