import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setPI(3.14);
        circle.setRadius(5);
        System.out.println("Circle.area = " + Circle.area(circle.getPI(), circle.getRadius()));
        System.out.println("Circle.circumference = " + Circle.circumference(circle.getPI(), circle.getRadius()));
    }
}