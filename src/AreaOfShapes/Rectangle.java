package AreaOfShapes;

public class Rectangle extends  Shape {
    double height,width;
    public Rectangle(double _height,double _width){
        this.height=_height;
        this.width=_width;
    }

    @Override
    public double getArea(){
        return  height*width;
    }
}
