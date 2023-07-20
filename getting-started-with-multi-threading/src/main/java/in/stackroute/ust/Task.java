package in.stackroute.ust;

public class Task implements Runnable {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }
    @Override
    public void run() {
        doTask();
    }
    private void doTask() {
        for (int i = 0; i < 5; i++) {
            System.out.format("Task %s is running.%n", taskName);
        }
    }
}
