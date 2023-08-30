package ThreadSynchronization;

public class PrintEven implements  Runnable {
    Main main=new Main();
    private  int counter=0;
    Object mutex;
    private  int Max=10;
    PrintEven(Object mutex){
        this.mutex=mutex;
    }

    @Override
    public void run(){
        try {
            printEven();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    void printEven() throws InterruptedException {
        synchronized (mutex){
            while (counter<Max){
                System.out.println("Even : "+counter);
                counter+=2;
                Thread.sleep(1000);
                mutex.notify();
                mutex.wait();
            }
        }
    }
}
