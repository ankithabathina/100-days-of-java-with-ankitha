import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {

    @Override
    public void run() {
        System.out.println(
            Thread.currentThread().getName()
            + " is executing the task."
        );
    }
}

public class ExecutorFrameworkDemo {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            executor.execute(new Task());
        }

        executor.shutdown();
    }
}
