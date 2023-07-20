package in.stackroute.ust;

public class AnotherTask extends Thread {
    private String taskName;
    private long milliSeconds;

    public AnotherTask(String taskName, long milliSeconds) {
        this.taskName = taskName;
        this.milliSeconds = milliSeconds;
    }

    @Override
    public void run() {
        try {
            doTask();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void doTask() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Thread.sleep(milliSeconds);
            System.out.format("Another task %s is running.%n",
                    taskName);
        }
    }
}
