/**
 * Thread-safe Singleton pattern example in Java.
 * This class ensures that only one instance of the class exists across the life of the application.
 */
public class Singleton {

    /**
     * Singleton instance.
     * The use of 'volatile' ensures that changes made from the Singleton instance are visible to all threads.
     */
    private static volatile Singleton uniqueInstance;

    /**
     * Private constructor to ensure no external instantiation.
     */
    private Singleton() {}

    /**
     * Global access point to the Singleton instance.
     * Double-checked locking approach.
     * This ensures that only one instance of Singleton is created, even in a multithreaded environment.
     *
     * @return uniqueInstance, the Singleton instance.
     */
    public static Singleton getInstance() {
        // Check the existence of an instance. Not synchronized to improve performance.
        if (uniqueInstance == null) {
            // Only allow one thread into at a time into the following block of code.
            synchronized (Singleton.class) {
                // Once in the block, check again and if still null, create an instance
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}