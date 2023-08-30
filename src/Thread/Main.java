package Thread;

public class Main {
    public static void main(String[] args) {
        PrintNumbers printNumbers=new PrintNumbers();
        PrintAlphabets printAlphabets=new PrintAlphabets();
        Thread t1=new Thread(printAlphabets);
        Thread t2=new Thread(printNumbers);
        t1.start();
        t2.start();
    }

    public  void printAlphabets(){
        for (char i='a';i<='z';i++){
            System.out.println(i +"\t");
        }
    }

    public  void printNumbers(){
        for (int j=10;j<=10;j++){
            System.out.println(j+"\t");
        }
    }
}
