package org.example;

public class Consumer {

    private final Container container;

    private final int itemsToConsume;

    public Consumer(Container container, int itemsToConsume) {
        this.container = container;
        this.itemsToConsume = itemsToConsume;
    }

    public void consume() {
        for (int i = 0; i < itemsToConsume; i++) {
            String content = container.getContent();
            System.out.printf("Consumed: %s: %d%n", content, content.length());
        }
    }
}
