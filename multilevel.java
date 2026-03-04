class Person {
String name;
void displayName() {
System.out.println("Name: " + name);
}
}

class Student extends Person {
int rollNo;
void displayRoll() {
System.out.println("Roll No: " + rollNo);
}
}

class CollegeStudent extends Student {
String course;
void displayCourse() {
System.out.println("Course: " + course);
}
}
public class Multilevel{
public static void main(String[] args) {
CollegeStudent cs = new CollegeStudent();
cs.name = "Harneesh";
cs.rollNo = 17;
cs.course = "CSE";
cs.displayName();
cs.displayRoll();
cs.displayCourse();
}
}