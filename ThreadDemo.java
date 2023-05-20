class One extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Good Morning");
            }
        }
    }
}

class Two extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Hello");
            }
        }
    }
}

class Three implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Welcome");
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        One t1 = new One();
        Two t2 = new Two();
        Three th = new Three();
        Thread t3 = new Thread(th);
        t1.setName("one");
        t2.setName("two");
        t3.setName("three");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        Thread t = Thread.currentThread();
        System.out.println(t);

        t1.start();
        t2.start();
        t3.start();
    }
}
