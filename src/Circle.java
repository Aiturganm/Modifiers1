public class Circle {
    private double PI ;
    private double radius;

    public double getPI(){
        return PI;
    }
    public void setPI(double PI){
        this.PI = PI;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public static double area(double PI, double radius){
        return (PI * (radius * radius));
    }
    public static double circumference(double PI, double radius){
        return (PI * 2 * radius);
    }
}
