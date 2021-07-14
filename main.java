/**
 * Thread
 */
public class main {
    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i < 10000; i++) {
                    if (i % 2 == 0)
                        System.out.println("Thread1: " + i + " Even");
                }
                System.out.println("Thread 1 finished");
            }

        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                int x = 1;
                int count = 0;
                for (int i = 1; i < 10000; i++) {
                    while (x <= i) {
                        if (i % x == 0) {
                            count++;
                        }
                        x++;
                    }
                    x = 1;
                    if (count == 2) {
                        System.out.println("Thread2 " + i + " Prime");
                    }
                    count = 0;
                }
                System.out.println("Thread 2 finished");
            }
        };

        thread1.start();
        thread2.start();
    }

}