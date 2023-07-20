package in.stackroute.ust;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        Task task3 = new Task("Task 3");

        task1.run();
        task2.run();
        task3.run();

        System.out.println();
        System.out.println();

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println();
        System.out.println();

        Thread thread4 = new AnotherTask("Task 4",1000);
        Thread thread5 = new AnotherTask("Task 5", 2000);
        Thread thread6 = new AnotherTask("Task 6", 3000);

        thread4.start();
        thread5.start();
        thread6.start();
    }
}