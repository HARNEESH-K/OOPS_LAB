import java.util.Scanner;
public class SumOfNumber {
public static void main(String[] args) {        
Scanner scanner = new Scanner(System.in);        
int sum = 0;
int number;
do {
System.out.print("Enter a number (enter 0 to stop): ");
number = scanner.nextInt(); 
sum += number;                          
} while 
(number != 0); 
System.out.println("The total sum is: " + sum);        
scanner.close(); 
}
}