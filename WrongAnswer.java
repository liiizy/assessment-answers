public class WrongAnswer {

    private int counter = 0;

    public static void main(String[] args) {
        new WrongAnswer().run();
    }

    private void run() {
        try {
            Thread t1 = new Thread(this::incrementToOnHundred);
            Thread t2 = new Thread(this::incrementToOnHundred);
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println("counter is " + counter);
        } catch (InterruptedException e) {
            System.err.println("fatal error, unexpected interrupt exception");
            System.exit(2);
        }
    }

    private synchronized void incrementToOnHundred() {
        for (int i = 0; i < 10000; i++) {
            doSomeFakeWork();
        }
    }

    private synchronized void doSomeFakeWork() {
        counter++;
    }
}