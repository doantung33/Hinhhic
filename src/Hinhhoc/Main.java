package Hinhhoc;

public class Main {

    public static void main(String[] args) {
        Shape shape= new Shape();
        System.out.println(shape);
        shape= new Shape("red",false);
        System.out.println(shape);

        Circle circle=new Circle("yellow",false,3);
        System.out.println(circle);

        Rectangle rectangle= new Rectangle(3,6);
        System.out.println(rectangle);

        Square square =new Square(5);
        System.out.println(square);


    }

}
