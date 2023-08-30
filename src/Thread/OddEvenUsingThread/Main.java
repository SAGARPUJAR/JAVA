package Thread.OddEvenUsingThread;

public class Main {
    public static void main(String[] args) {
        PrintEven printEven=new PrintEven();
        PrintOdd printOdd=new PrintOdd();
        Thread t1=new Thread(printEven);
        Thread t2=new Thread(printOdd);
        t1.start();
        t2.start();
    }

    public  void printEvenNumber() throws InterruptedException {
        for (int i=0;i<=10;i+=2){
            System.out.print("Even : "+i+"\t");
            Thread.sleep(1000);
        }
    }
    public  void printOddNumber() throws InterruptedException {
        for (int i=1;i<=10;i+=2){
            System.out.print("Odd : "+i+"\t");
            Thread.sleep(1000);
        }
    }
}
