package com.company;

public class Store {
    private int product;

    public synchronized void produce() {
        while (product >= 3
        ) {
            try {
                wait();
            } catch (InterruptedException ie) {
            }
        }
        product++;
        System.out.println("Producer realized one product:");
        System.out.println("Products in sklad: " + product);
        notify();

    }

    public synchronized void buy() {
        while (product < 1) {
            try {
                wait();
            } catch (InterruptedException ie) {
            }
            System.out.println("Buyer bought one product:");
            System.out.println("Products in sklad: " + product);
            notify();

        }
        product--;
        System.out.println("Pokupka tol'ko odnogo producta");
        notify();
    }

}
