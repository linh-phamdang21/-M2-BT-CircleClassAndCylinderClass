public class Circle {
    private double radius = 2;
    private String color = "green";

    public Circle(){

    }

    public Circle (double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter(){
        return Math.PI * this.radius * 2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + this.radius +
                ", color='" + this.color + '\'' +
                '}';
    }
}
