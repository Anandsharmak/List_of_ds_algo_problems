mplement a job scheduler which takes in a function f and an integer n, and calls f after n milliseconds


private static ScheduledExecutorService executor;

public static void main(String args[]) {
    executor = Executors.newSingleThreadScheduledExecutor();

    ScheduledFuture<?> future = solution( () -> System.out.println("Hello World"), 1000);

    // Use future here, if desired.

    // Cleanup
    executor.shutdown();
    executor = null;
}

public static ScheduledFuture<?> solution(Runnable command, int delay_ms) {
    return executor.schedule( command, delay_ms, TimeUnit.MILLISECONDS );
}
