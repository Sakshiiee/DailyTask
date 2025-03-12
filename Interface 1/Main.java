public class Main {
    public static void main(String[] args) {
        Shape Rectangle = new Rectangle(10, 5);
        Shape Circle = new Circle(7);
        Shape Triangle = new Triangle(6, 8);

        System.out.println("Rectangle Area: " + Rectangle.getArea());
        System.out.println("Circle Area: " + Circle.getArea());
        System.out.println("Triangle Area: " + Triangle.getArea());
    }
}
