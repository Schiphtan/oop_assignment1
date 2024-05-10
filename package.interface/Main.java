public class Main {
    
    public static void main(String[] args) {

        // Main for Shape
        
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(5, 8);

        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Triangle: " + triangle.getArea());

        // Main for Animal
        Dog dog = new Dog();

        dog.bark();

        // Main for Flayable

        Spacecraft spacecraft = new Spacecraft();
        Airplane airplane = new Airplane();
        Helicopter helicopter = new Helicopter();

        spacecraft.fly_obj();
        airplane.fly_obj();
        helicopter.fly_obj();
    }
}
