package CIA1.SectionC;

public class PrintAlphabets implements Runnable{
    char ch='a';
    Object mutex;
    PrintAlphabets(Object _mutex){
        this.mutex=_mutex;
    }
    @Override
    public void run() {
        try {
            printAlphabets();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public  void printAlphabets() throws InterruptedException {
        synchronized (mutex){
            while (ch<='z'){
                System.out.print(ch);
                ch++;
                Thread.sleep(1000);
                mutex.notify();
                mutex.wait();
            }
        }
    }
}

