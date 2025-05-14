public class Deadlock {

    static final Object lipstick = new Object();
    static final Object mirror = new Object();

    public static void main(String[] args) {
        Thread girl1 = new Thread(() -> {
            synchronized (lipstick) {
                System.out.println("Girl1: Holding lipstick...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (mirror) {
                    System.out.println("Girl1: Using mirror.");
                }
            }
        });

        Thread girl2 = new Thread(() -> {
            synchronized (mirror) {
                System.out.println("Girl2: Holding mirror...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (lipstick) {
                    System.out.println("Girl2: Using lipstick.");
                }
            }
        });

        girl1.start();
        girl2.start();
    }
}



