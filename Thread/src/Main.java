import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Create threads in new state
//        ThreadMethodsDemo t1 = new ThreadMethodsDemo("Thread-1");
//        ThreadMethodsDemo t2 = new ThreadMethodsDemo("Thread-2");
//
//        // Set priorities
////        t1.setPriority(Thread.MIN_PRIORITY); // 1
////        t2.setPriority(Thread.MAX_PRIORITY); // 10
//
//        // Start threads and turn to Runnable state
//        t1.start();
//        t2.start();
//
//        // Display main thread info
//        Thread mainThread = Thread.currentThread();
//        System.out.println("Main thread: " + mainThread.getName());
//
//        // Wait for t1 to finish before continuing
////        t1.join();
//        System.out.println(t1.getName() + " is alive? " + t1.isAlive());
//
//        // Interrupt t2 as an example
////        t2.interrupt();
//
//        System.out.println("Main thread finished.");




        // Library System Demo
        Library library = new Library(Arrays.asList("Java Basics", "OOP Concepts", "Data Structures"));

        Member m1 = new Member("Aya", library, "Java Basics");
        Member m2 = new Member("Sara", library, "Java Basics");
        Member m3 = new Member("Omar", library, "OOP Concepts");

        m1.start();
        m2.start();
        m3.start();
    }
}