package CIA1.SectionC;

public class Main {
    static Object mutex=new Object();
    public static void main(String[] args) {
        PrintAlphabets printAlphabets=new PrintAlphabets(mutex);
        PrintNumbers printNumbers=new PrintNumbers(mutex);
        Thread t1=new Thread(printAlphabets);
        Thread t2=new Thread(printNumbers);
        t2.start();
        t1.start();
    }
}
