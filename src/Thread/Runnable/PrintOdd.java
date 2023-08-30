package Thread.Runnable;

public class PrintOdd implements Runnable{
    @Override
    public void run() {
        Main main=new Main();
        try {
            main.printOdd();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
