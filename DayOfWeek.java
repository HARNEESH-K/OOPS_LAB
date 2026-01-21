import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day;
        System.out.println("Please enter a day of the week (1-7):");
        day = input.nextInt();
        String message;

          switch (day) {
            case 1:message = "It's Monday!";
                break;
            case 2:message = "It's Tuesday!";
                break;
            case 3:message = "It's Wednesday!";
                break;
            case 4:message = "It's Thursday!";
                break;
            case 5:message = "It's Friday!";
                break;
            case 6:message = "It's Saturday!";
                break;
            case 7:message = "It's Sunday!";
                break;
            default:message = "Invalid day of the week";
                break;
        }
        System.out.println(message);
        input.close();
    }
}
