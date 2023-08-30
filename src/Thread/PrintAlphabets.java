package Thread;

public class PrintAlphabets extends Thread {
    @Override
    public void run(){
        Main main=new Main();
        main.printAlphabets();
    }
}
