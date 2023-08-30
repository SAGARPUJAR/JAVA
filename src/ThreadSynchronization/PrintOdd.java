package ThreadSynchronization;

public class PrintOdd implements  Runnable{
    Main main=new Main();
    private int counter=1;
    Object mutex;
    private  int Max=10;
    PrintOdd(Object mutex){
        this.mutex=mutex;
    }
    @Override
    public void run(){
        try {
            printOdd();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    void printOdd() throws InterruptedException {
        synchronized (mutex){
            while (counter<Max){
                mutex.wait();
                System.out.println("Odd : "+counter);
                Thread.sleep(1000);
                counter+=2;
                mutex.notify();
            }
        }
    }
}
