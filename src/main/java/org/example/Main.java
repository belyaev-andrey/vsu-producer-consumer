package org.example;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        Producer p = new Producer(container, 10);
        Consumer c = new Consumer(container, 10);
        p.produce();
        c.consume();
        System.out.println("Finished!");
    }
}