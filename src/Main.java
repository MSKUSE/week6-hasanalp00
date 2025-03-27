public class Main {
    public static void main(String[] args) {

        Point p1 = new Point();
        String s1 = new String( "Ali");

        System.out.println(p1.xCoord);
        System.out.println(p1.yCoord);

        Point p2 = new Point(3 ,4);
        System.out.println(p2.xCoord);
        System.out.println(p2.yCoord);

        Point p3 = new Point(5);
        System.out.println(p3.xCoord);
        System.out.println(p3.yCoord);

        Point tLeft = new Point(3 ,4);
        Rectangle r1 = new Rectangle(
                tLeft,
                3,
                4
        );
        System.out.println(r1.getSideA());
        System.out.println(r1.getSideB());
        System.out.println(r1.getTopLeft().xCoord);
        System.out.println(r1.getTopLeft().yCoord);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());

        Circle c1 = new Circle(
                new Point(3,4),
                5
        );
        /*
        System.out.println(c1.getRadius());
        c1.setRadius(1);
        System.out.println(c1.getRadius());
        Rectangle r2= new Rectangle(tLeft, 1,2);
        System.out.println(r1.counterforobject);
        System.out.println(r2.counterforobject);
        System.out.println(Rectangle.counter);
        System.out.println(Circle.className);
        Point myPoint= new Point(7,3);
        System.out.println(myPoint.toString());
        */
        Shape shape=new Shape(new Point(5,6));
        Rectangle r = new Rectangle();
        Circle c=new Circle(c, 0, 3);
    }
}