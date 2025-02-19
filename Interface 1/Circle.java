// class Circle implements Shapes{

//     private static final double PI= 3.14;
//     private double radius;

//     public Circle(double radius){
        
//         this.radius=radius;

//     }
//     public double getArea(){
//         return PI*radius*radius;
//     }


// }

public abstract class Circle implements Shapes {
    private double radius;
    private static final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}