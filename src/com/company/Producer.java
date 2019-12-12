package com.company;

public class Producer extends Thread {

    Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i <5; i++) {
            store.produce();

        }
    }
}
