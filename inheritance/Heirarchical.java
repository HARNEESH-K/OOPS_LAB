class Vehicle {
void start() {
System.out.println("Vehicle is starting");
}
}

class Car extends Vehicle {
void showType() {
System.out.println("This is a Car");
}
}

class Bike extends Vehicle {
void showType() {
System.out.println("This is a Bike");
}
}

public class Heirarchical{
public static void main(String[] args) {
Car c = new Car();
c.start();
c.showType();
Bike b = new Bike();
b.start();
b.showType();
}
}