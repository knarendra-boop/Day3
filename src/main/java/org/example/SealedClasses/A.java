package org.example.SealedClasses;


public sealed  class A permits B {
    void play() {
        System.out.print("hello world");
    }
}
