package org.example;

public class PatternMatching {

    public static void main(String[] args) {


        Object obj1 = "hello pattern";
        Object obj2 = 20;
        Object obj3 = 3.14;
        Object obj4 = null;

        Object obj = "Hello";

        if (obj instanceof String) {        // 1️⃣ check type
            String s = (String) obj;       // 2️⃣ cast manually
            System.out.println(s.toUpperCase());
        }
        if (obj instanceof String S) {        // 1️⃣ check type// 2️⃣ cast manually
            System.out.println(S.toUpperCase());
        }
        Object obje1 = "hello";

        switch (obje1) {
            case String s    -> System.out.println("String: " + s.toUpperCase());
            case Integer i   -> System.out.println("Integer: " + (i + 10));
            case Double d    -> System.out.println("Double: " + (d * 2));
            case null        -> System.out.println("Null value");
            default          -> System.out.println("Unknown type");
        }


    }
}
