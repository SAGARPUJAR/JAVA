package CIA1.SectionC;

public class PrintNumbers implements  Runnable{
    private  int MAX=26;
    private  int Counter=1;
    Object mutex;
    PrintNumbers(Object _mutext){
        this.mutex=_mutext;
    }
    @Override
    public void run() {
        try {
            printNumbers();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public  void printNumbers() throws InterruptedException {
        synchronized (mutex){
            while (Counter<=MAX){
                mutex.wait();
                System.out.print(Counter+"\t");
                Counter+=1;
                Thread.sleep(1000);
                mutex.notify();
            }
        }
    }
}
