class Friend {
void talk(String name) {
System.out.println("Talking with " + name);
}
void talk(String name, int hours) {
System.out.println("Talking with " + name + " for " + hours + " hours");
}
void talk(int friendsCount) {
System.out.println("Talking with " + friendsCount + " friends together");
}
}
public class Overloading {
public static void main(String[] args) {
Friend f = new Friend();
f.talk("Arjun");
f.talk("Rahul", 2);
f.talk(5);
}
}