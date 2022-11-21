public class Main {
    public static void main(String[] args)throws InterruptedException {

        ThreadsRace t = new ThreadsRace();
        Thread thread1 = new Thread(new CounterThread(t));
        Thread thread2 = new Thread(new CounterThread(t));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(t.getCounter());
    }
}
