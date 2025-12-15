package org.example;

public record person(String name, int age) {
}
class personApp{
    public static void main(String[] args) {
        person p = new person("narendra", 22);
       // p.age(20);
 System.out.println(p);
    }
}
