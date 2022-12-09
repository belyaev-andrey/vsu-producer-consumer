package org.example;

import java.util.Random;

public class Producer {

    private final Container container;
    private final int itemsToProduce;

    public Producer(Container container, int itemsToProduce) {
        this.container = container;
        this.itemsToProduce = itemsToProduce;
    }

    public void produce() {
        final Random r = new Random();
        for (int i = 0; i < itemsToProduce; i++) {
            String content = Integer.toBinaryString(i);
            System.out.printf("Produced: %s%n", content);
            container.setContent(content);
            try {
                Thread.sleep(r.nextInt(100));
            } catch (InterruptedException e) {/*Do nothing*/}
        }
    }
}
