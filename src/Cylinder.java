public class Cylinder extends Circle {
    private double height;

    public Cylinder(){

    }

    public Cylinder(double radius, String color, double height){
        super(radius,color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume (){
        return this.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + this.getRadius() +
                ", color='" + this.getColor() + '\'' +
                "height= " + this.height +
                '}';
    }
}

