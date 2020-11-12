package Hinhhoc;

public class Rectangle extends Shape {
    public double width =1;
    public double length =1;
    public Rectangle(){

    }
    public Rectangle(double width,double length ){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double side, String color, boolean filled){
        this.width=side;
    }
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width+length)*2;
    }
    @Override
    public String toString(){
        return "A Rectangle with = " +width+ " and length = "+ length+", which is a subclass of : " +super.toString();
    }
}
