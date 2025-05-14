import java.util.concurrent.*;

class MyCallable implements Callable<String> {
    public String call() throws Exception {
        return "Task completed!";
    }
}

public class CallableDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newSingleThreadExecutor();

        Future<String> future = service.submit(new MyCallable());

        String result = future.get(); // waits for result
        System.out.println("Result: " + result);

        service.shutdown();
    }
}



