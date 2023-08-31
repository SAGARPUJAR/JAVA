package AreaOfShapes;

public class Square  extends Shape{
    double height;
    public Square(double _height){
        this.height=_height;
    }
    @Override
    public double getArea(){
        return  height*height;
    }
}
