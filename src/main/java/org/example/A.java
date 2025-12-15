package org.example;

public sealed  class A permits B{
    void play() {
        System.out.print("hello world");
    }
}

non-sealed class B   extends A
{
    void play() {
        System.out.print("nare");
    }
}
class c extends B {

}
class sealedAppv{
    public static void main(String[] args) {


    B B = new B();
    B.play();
}}