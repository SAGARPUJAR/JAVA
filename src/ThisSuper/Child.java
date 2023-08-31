package ThisSuper;

public class Child extends  Parent{
    int x,y;
    Child(){
        this(0,0);
    }

    Child(int _a,int _b){
        super(_a+1,_b+1);
    }

    public  void print(){
        System.out.println("this  : "+x+" and "+y);
        System.out.println("base : "+super.a +" and "+super.b);
    }
}
