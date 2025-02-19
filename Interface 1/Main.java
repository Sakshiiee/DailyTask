

// // public class Main{

// //     public static void main(String args[]){

// //         Shapes rectangle = new Rectangle(20,10);
// //         Shapes Circle =new Circle(3);
// //         Shapes Triangle = new Triangle(2,4);

// //         rectangle.getArea();
// //         Triangle.getArea();
// //         Circle.getArea();



// //     }
// // }


// public class Main {
//     public static void main(String[] args) {
//         Shape Rectangle = new Rectangle(20, 10);
//         Shape Circle = new Circle(3);
//         Shape Triangle = new Triangle(2, 4);

//         System.out.println("Rectangle Area: " + Rectangle.getArea());
//         System.out.println("Circle Area: " + Circle.getArea());
//         System.out.println("Triangle Area: " + Triangle.getArea());
//     }
// }

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(20, 10);
        Shape circle = new Circle(3);
        Shape triangle = new Triangle(2, 4);

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Triangle Area: " + triangle.getArea());
    }
}