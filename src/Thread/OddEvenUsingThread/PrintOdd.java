package Thread.OddEvenUsingThread;

public class PrintOdd extends  Thread{
    @Override
    public void run(){
        Main main=new Main();
        try {
            main.printOddNumber();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
