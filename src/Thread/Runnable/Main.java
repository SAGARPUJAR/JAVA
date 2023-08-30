package Thread.Runnable;

public class Main {
    public static void main(String[] args) {
        PrintOdd printNumbers=new PrintOdd();
        PrintEven printAlphabets=new PrintEven();
        Thread t1=new Thread(printAlphabets);
        Thread t2=new Thread(printNumbers);
        t2.start();
        t1.start();

    }

    public void printOdd() throws InterruptedException {
        for (int i=0;i<=10;i++){
            if (i%2!=0){
                System.out.print("Odd : "+i+"\t");
                Thread.sleep(1000);
            }
        }
    }

    public void printEven() throws InterruptedException {
        for (int i=0;i<=10;i++){
            if (i%2==0){
                System.out.print("Even : "+i+"\t");
                Thread.sleep(1000);
            }
        }
    }
}
