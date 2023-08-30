package ThreadSynchronization;

public class Main {
    static Object mutex = new Object();
    static int counter = 0,Max=10;
    public static void main(String[] args) {
        Main m = new Main();
        PrintEven printEven = new PrintEven(mutex);
        Thread even = new Thread(printEven);
        PrintOdd printOdd = new PrintOdd(mutex);
        Thread odd = new Thread(printOdd);
        odd.start();
        even.start();
    }
}
