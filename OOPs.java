void main() {
    //------------------------------------------------------------------------
    // OOPS CONCEPTS
    //------------------------------------------------------------------------

    //=======================================================================
    // 1. CLASS(BluePrint) & OBJECTS(Real world Entity)
    //=======================================================================
    class Car {
        String brand;       // property
        int speed;

        void drive() {      // method
            System.out.println(brand + " is driving at " + speed + " km/h");
        }
    }

    // Usage
    Car c = new Car();
    c.brand = "BMW";
    c.speed = 120;
    c.drive();   // BMW is driving at 120 km/h

    //=======================================================================
    // 2. ENCAPSULATION (Hiding data using private fields + getters/setters)
    //=======================================================================
    class BankAccount {
        private int balance;        // hidden data

        public void deposit(int amount) {
            balance += amount;
        }

        public int getBalance() {
            return balance;
        }
    }

    // Usage
    BankAccount acc = new BankAccount();
    acc.deposit(500);
    acc.getBalance();   // 500

    //=======================================================================
    // 3. INHERITANCE (Child class inherits from Parent)
    //=======================================================================
    class Animal {
        void sound() {
            System.out.println("Animal makes sound");
        }
    }

    class Dog extends Animal {      // inherits Animal
        void bark() {
            System.out.println("Dog barks");
        }
    }

    // Usage
    Dog d = new Dog();
    d.sound();   // inherited method
    // Dog barks

    //=======================================================================
    // 4. POLYMORPHISM (Same function name – different forms)
    //=======================================================================
    // A) Compile-time polymorphism (Method Overloading)
    class MathOps {
        int add(int a, int b) { return a + b; }
        int add(int a, int b, int c) { return a + b + c; }
    }

    // B) Runtime polymorphism (Method Overriding)
    class Shape {
        void draw() { System.out.println("Drawing shape"); }
    }
    class Circle extends Shape {
        @Override
        void draw() { System.out.println("Drawing circle"); }
    }

    Shape s = new Circle();
    s.draw();   // Drawing circle

    //=======================================================================
    // 5. ABSTRACTION (Hiding implementation, showing only essential features)
    //=======================================================================
    abstract class Vehicle {
        abstract void start();  // abstract method
    }

    class Bike extends Vehicle {
        void start() {
            System.out.println("Bike starts with key");
        }
    }

    Vehicle v = new Bike();
    v.start();   // Bike starts with key

    //=======================================================================
    // 6. INTERFACES (Blueprint of class, supports multiple inheritance)
    //=======================================================================
    interface Drivable {
        void drive();     // interface methods are abstract by default
    }

    class Tesla implements Drivable {
        public void drive() {
            System.out.println("Tesla driving in autopilot mode");
        }
    }

    Drivable t = new Tesla();
    t.drive();

    //=======================================================================
    // 7. CONSTRUCTORS (Runs when object is created)
    //=======================================================================
    class Student {
        String name;

        Student(String name) {      // constructor
            this.name = name;
        }
    }

    Student st = new Student("John");

    //=======================================================================
    // 8. THIS & SUPER KEYWORD
    //=======================================================================
    // this = refers to current object
    // super = refers to parent class

    class Parent {
        int x = 10;
    }
    class Child extends Parent {
        int x = 20;
        void show() {
            System.out.println(this.x);  // 20
            System.out.println(super.x); // 10
        }
    }

    //=======================================================================
    // 9. STATIC KEYWORD (shared across all objects)
    //=======================================================================
    class Counter {
        static int count = 0;
        Counter() { count++; }
    }

    Counter c1 = new Counter();
    Counter c2 = new Counter();
    // count = 2

    //=======================================================================
    // 10. FINAL KEYWORD (cannot change)
    //=======================================================================
    final int A = 10;    // constant
    // A = 20;  // ❌ ERROR

    final class AClass {}  // cannot be inherited

    //=======================================================================
    // 11. METHOD OVERRIDING vs OVERLOADING (Quick Summary)
    //=======================================================================
    // Overloading → same method name, different parameters
    // Overriding → same method name, same parameters, different class (inheritance)

    //=======================================================================
    // 12. OOP QUICK SUMMARY
    //=======================================================================
    // Encapsulation → hide data (private + getters/setters)
    // Abstraction → show only essential features (abstract, interface)
    // Inheritance → child class uses parent class
    // Polymorphism → many forms (overloading + overriding)

    //------------------------------------------------------------------------
    // ACCESS MODIFIERS
    //------------------------------------------------------------------------
    /*
    public      -> accessible everywhere.
    protected   -> accessible in same package + subclasses.
    default     -> accessible only within same package (no keyword).
    private     -> accessible only within the same class.
    */

    //------------------------------------------------------------------------
    // INTERFACE
    //------------------------------------------------------------------------
    /*
    Interfaces define a contract that classes must follow.
    They support abstraction and multiple inheritance.
    */

    interface Vehicle {
        // VARIABLES — always public static final
        int MAX_SPEED = 120;   // same as: public static final int MAX_SPEED = 120;

        // ABSTRACT METHOD — must be implemented by class
        void drive();

        // DEFAULT METHOD — has a body (Java 8+)
        default void horn() {
            System.out.println("Beep Beep (default method)");
        }

        // STATIC METHOD — belongs to interface itself (Java 8+)
        static void serviceInfo() {
            System.out.println("Service every 6 months (static method)");
        }

        // PRIVATE METHOD — helper method for default methods (Java 9+)
        private void checkEngine() {
            System.out.println("Engine OK (private method)");
        }
    }

    // CLASS IMPLEMENTING INTERFACE
    class Car implements Vehicle {
        @Override
        public void drive() {
            System.out.println("Car is driving...");
        }
    }
    //EXTRA RULES
    //------------------------------------------------------------------------
    /*
    1. Variables in an interface are ALWAYS:
       - public
       - static
       - final
       Even if you don’t write these keywords.
       Example:
           int x = 10; // actually public static final int x = 10;

    2. Interface methods:
       - Before Java 8: only abstract methods.
       - Java 8+: can have default methods (with body) using 'default' keyword.
       - Java 8+: can have static methods (with body).
       - Java 9+: can have private methods (helper methods inside interface).
    */
}