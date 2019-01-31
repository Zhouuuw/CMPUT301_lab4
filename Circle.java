//circle class for lab
//new branch

public class Circle extends Shape{

    private double radius;
    private double x;
    private double y;

    public Circle(double x, double y, double radius){

        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public double getR(){

        return radius;
    }
}