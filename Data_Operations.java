public class Data_Operations {
public static void main(String[] args) {
double a = 123456, b = 789456;
boolean x = true, y = false;
        
System.out.println("=== ARITHMETIC OPERATORS ===");
System.out.println("a + b = " + (a + b));    
System.out.println("a - b = " + (a - b));     
System.out.println("a * b = " + (a * b));     
System.out.println("a / b = " + (a / b));     
System.out.println("a % b = " + (a % b));    
        
System.out.println("\n=== UNARY OPERATORS ===");
System.out.println("Original a: " + a);
a++;  
System.out.println("After a++: " + a);
a--;    
System.out.println("After a--: " + a);
        
System.out.println("\n=== RELATIONAL OPERATORS ===");
System.out.println("a < b: " + (a < b));
System.out.println("a <= b: " + (a <= b));
System.out.println("a > b: " + (a > b));
System.out.println("a >= b: " + (a >= b));
System.out.println("a == b: " + (a == b));
System.out.println("a != b: " + (a != b));
        
System.out.println("\n=== LOGICAL OPERATORS ===");
System.out.println("x && y: " + (x && y));
System.out.println("x || y: " + (x || y));
System.out.println("!x: " + (!x));
System.out.println("!y: " + (!y));
}
}