public class CounterThread implements  Runnable{
    ThreadsRace app;

    public CounterThread(ThreadsRace app) {
        this.app = app;
    }
    @Override
    public void run() {

        for (int a=0; a < 20000; a++){
            app.increment();
        }
    }
}
