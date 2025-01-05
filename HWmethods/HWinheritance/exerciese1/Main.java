public class Main {
    public static void main(String[] args) {

        Shape Circle = new Circle(10);
        Shape Rectangle = new Rectangle(5, 4);

        System.out.println("Shape circle area is =" + Circle.calculateArea());
        System.out.println("Shape circle perimeter is =" + Circle.calculatePerimeter());

        System.out.println("Share rectangle area is =" + Rectangle.calculateArea());
        System.out.println("Shape rectangle perimeter is =" + Rectangle.calculatePerimeter());

    }
}