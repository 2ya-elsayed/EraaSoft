public class ThreadMethodsDemo extends Thread{
    public ThreadMethodsDemo(String name) {
        super(name); // Set thread name
    }

    @Override
    public void run() {
        try {
            // Show current thread info
            System.out.println(getName() + " started with priority " + getPriority());

            for (int i = 1; i <= 3; i++) {
                System.out.println(getName() + " is running, count: " + i);
                Thread.sleep(500); // Pause for 0.5 second
            }

            System.out.println(getName() + " finished execution.");

        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted!");
        }
    }
}
