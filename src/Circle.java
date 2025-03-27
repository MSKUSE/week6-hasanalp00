public class Circle extends Shape {

    private Point center;
    private int radius;
    public static String className="Circle";

    public Circle(Shape location,Point center, int radius) {
        super(location);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius <= 0){
            throw new IllegalArgumentException("Radius cant be negative and zero..");
        }else {
            this.radius = radius;

        }
    }
    public double area(){
        return Math.PI * this.radius * this.radius;
    }
    public double perimeter(){
        return 2* Math.PI*this.radius;
    }
    public String toString(){
        return "Radius:"+radius+"Center:"+center;
    }
}
