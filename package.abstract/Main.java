
public class Main {
    
    public static void main(String[] args) {
        
        // Main for Parent
        FirstSubclass first = new FirstSubclass();
        SecondSubclass second = new SecondSubclass();
    
        first.message(); 
        second.message(); 


        // Main for Bank
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

       
        System.out.println("Bank A balance: $" + bankA.getBalance());
        System.out.println("Bank B balance: $" + bankB.getBalance());
        System.out.println("Bank C balance: $" + bankC.getBalance());

        //Main for Marks
        StudentA studentA = new StudentA(80, 85, 90);
        StudentB studentB = new StudentB(75, 80, 85, 90);

        
        System.out.println("Percentage of marks for Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of marks for Student B: " + studentB.getPercentage() + "%");

        // Main for AbstractClass

        SubClass sub = new SubClass();

        sub.a_method();
        sub.normalMethod();

        // Main for Animals

        Cats cat = new Cats();
        Dogs dog = new Dogs();

        cat.cats(); 
        dog.dogs();


        // Main for Shape

        Area area = new Area();

        
        double rectangleArea = area.rectangleArea(5, 10);
        double squareArea = area.squareArea(5);
        double circleArea = area.circleArea(5);

        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Circle: " + circleArea);
    }
}