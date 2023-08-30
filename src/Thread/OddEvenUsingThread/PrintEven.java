package Thread.OddEvenUsingThread;

public class PrintEven extends  Thread {
    @Override
    public  void run(){
        Main main=new Main();
        try {
            main.printEvenNumber();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
