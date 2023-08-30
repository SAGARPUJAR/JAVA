package Thread;

public class PrintNumbers extends Thread {

    @Override
    public  void run(){
        Main main  =new Main();
        main.printNumbers();

    }
}
