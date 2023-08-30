package Thread.Runnable;

public class PrintEven implements Runnable{
    @Override
    public void run() {
        Main main=new Main();
        try {
            main.printEven();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
