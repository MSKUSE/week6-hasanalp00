public class Triangle extends Shape{
    private int sideA,sideB,sideC;
    public Triangle(Shape location,int sideA,int sideB,int sideC){
        super(location);
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
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
    public void setSideC(int sideC) {
        if (sideC <= 0) {
            throw new IllegalArgumentException("Side C cant be negative and zero..");
        } else {
            this.sideC = sideC;
        }
    }
    public int getSideC() {
        return sideC;
    }
    public void setSideB(int sideB) {
            if (sideB <= 0) {
                throw new IllegalArgumentException("Side B cant be negative and zero..");
            } else {
                this.sideB = sideB;
            }
    }
    public double perimeter(){
        return (sideA + sideB + sideC);
    }
    @Override
    public double area(){
        return sideA * sideB /2;
    }
    public String toString(){
        return "Side A:"+sideA+"Side B:"+sideB+"Side C:"+sideC;
    }
}
