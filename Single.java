class Person{
String name;
int age;
Person(String name,int age){
this.name=name;
this.age=age;
}
}

class Student extends Person{
int studentId;
String course;
Student(String name,int age,int studentId,String course){
super(name,age);
this.studentId=studentId;
this.course=course;
}

void display(){
System.out.println("Name : "+name);
System.out.println("Age : "+age);
System.out.println("Student Id : "+studentId);
System.out.println("Course : "+course);
}
}

public class Single{
public static void main(String[] args){
Student s=new Student("Deepa",18,12,"CSE");
s.display();
}
}
