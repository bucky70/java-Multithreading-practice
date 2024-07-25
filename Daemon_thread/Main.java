package Daemon_thread;

public class Main {

    public static void main(String[] args) {
        Thread daemonThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Daemon thread is running");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        // Set the thread as daemon
        daemonThread.setDaemon(true);

        // Start the daemon thread
        daemonThread.start();

        // User thread prints a message and then terminates
        System.out.println("User thread is running and will terminate soon");
        
        // The JVM will exit after this main method ends,
        // causing the daemon thread to stop as well
    }
}
