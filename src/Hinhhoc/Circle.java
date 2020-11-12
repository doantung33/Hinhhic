package Hinhhoc;

public class Circle extends Shape {
    public double radius =1;
    public Circle(){

    }
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea (){
        return radius*radius*Math.PI;
    }
    public double getPreimeter(){
        return radius*2*Math.PI;
    }
    @Override
    public String toString(){
        String f;
        if (filled){
            f = "Filled";
        }else {
            f= "notFilled";
        }
        return "Radius is :" +getRadius()+
                "\n which is a subclass of :\n " +super.toString();
//                "\n Area is "+ getArea()+
//                "\n Preimeter is :"+ getPreimeter();
    }

}
