package ru.sky.pro.stream.thread.live.synchronize;

public class SynchStaticMethodApp {
    public static void main(String[] args) {
        SynchStaticMethodApp e = new SynchStaticMethodApp();
        new Thread(() -> classMethod()).start();
        new Thread(() -> e.classMethod()).start();
    }

    public synchronized static void classMethod() { //выступает сам класс
        System.out.println("Synch Static Method Start");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Synch Static Method End");
    }

    public synchronized void objectMethod() {
        System.out.println("Synch Method Start");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Synch Method End");
    }
}
