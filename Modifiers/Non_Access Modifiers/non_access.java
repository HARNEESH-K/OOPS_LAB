abstract class Student {
abstract void rollno();
}
class harneesh extends Student {
void rollno() {
System.out.println("Roll No: CH.SC.U4CSE25217");
}
}
class Clg {
static String avv = "Amrita Vishwa Vidyapeetham";
}
public class non_access {
public static void main(String[] args) {
System.out.println("College Name: " + Clg.avv);
harneesh h = new harneesh();
h.rollno();
}
}