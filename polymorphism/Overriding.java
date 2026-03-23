class Friend {
void activity() {
System.out.println("Friends are on a Trip");
}
}
class BestFriend extends Friend {
void activity() {
System.out.println("Best friends are Takin Part in My Loneliness");
}
}
public class Overriding {
public static void main(String[] args) {
Friend f;
f = new Friend();
f.activity();
f = new BestFriend();
f.activity();
}
}