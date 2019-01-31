//circle class for lab
//new branch

public class Circle extends Shape{

    private double radius;
    private double x;
    private double y;
    private  String color;

    public Circle(double x, double y, double radius, String color){

        this.radius = radius;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public double getR(){

        return radius;
    }
}