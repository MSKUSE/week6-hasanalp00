


public class Rectangle extends Shape {

    private Point topLeft;
    private int sideA , sideB;
    public static int counter=0;
    public int counterforobject=0;

    public Rectangle(Point topLeft, int sideA, int sideB) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideB);
        counter++;
        counterforobject++;
    }

    public Rectangle(Point topLeft, int sideA) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideA);
        counter++;
        counterforobject++;
    }
    public Rectangle(Point location,int sideA,int sideB){
        super(location);
        setSideA(sideA);
        setSideB(sideB);
    }
    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA <= 0){
            throw new IllegalArgumentException("Side A cant be negative and zero..");
        }
        else {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB <= 0) {
            throw new IllegalArgumentException("Side B cant be negative and zero..");
        } else {
            this.sideB = sideB;
        }
    }
    @Override
    public int perimeter(){
        return 2 * (sideA + sideB);
    }
    @Override
    public int area(){
        return sideA * sideB;
    }
    public String toString(){
        return "Side A:"+sideA+"Side B:"+sideB;
    }

}
