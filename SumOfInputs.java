import java.util.Scanner;
public class SumOfInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        System.out.println("Enter numbers to sum (enter 0 to stop):");
        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            if (number == 0) {
                break; 
            }
            sum += number; 
        }
        scanner.close();
        System.out.println("The total sum of the numbers entered is: " + sum);
    }
}