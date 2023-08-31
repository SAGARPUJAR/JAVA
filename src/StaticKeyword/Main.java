package StaticKeyword;

public class Main {
    int count=0;
    static  int staticCounter=0;

    static{
        System.out.println("Static block Executed..");
    }
    public void incrementValues(){
        count++;
        staticCounter++;
        System.out.println("counter : "+count);
        System.out.println("Static Counter : "+staticCounter);
    }
    public static void main(String[] args) {
        System.out.println("Main Method Executed..");
        Main m=new Main();
        Main m1=new Main();
        m.incrementValues();
        m1.incrementValues();
    }
}
