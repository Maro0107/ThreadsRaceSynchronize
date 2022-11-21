public class ThreadsRace {
    public int counter = 0;
    public synchronized void increment(){
        this.counter++;
    }

//    public void increment(){
//        this.counter++;
//    }
    
    public int getCounter(){
        return counter;
    }
}
