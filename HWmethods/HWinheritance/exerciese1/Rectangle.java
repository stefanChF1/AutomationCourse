public class Rectangle implements Shape {

    private double sideA;
    private double sideB;

    public Rectangle (double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return  (sideA * sideB);
    }

    @Override
    public double calculatePerimeter() {
        return ((sideA + sideB) * 2);
    }
}
