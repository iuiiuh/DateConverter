import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Date Converter Tool");
        System.out.println("1. Convert Date Format");
        System.out.println("2. Calculate Date Difference");
        System.out.println("3. Exit");

        System.out.print("Choose option: ");
        int choice = input.nextInt();

        switch(choice) {
            case 1:
                convertDateFormat(input);
                break;
            case 2:
                calculateDateDifference(input);
                break;
            case 3:
                System.out.println("Thank you for using the tool!");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        input.close();
    }

    public static void convertDateFormat(Scanner input) {
        System.out.println("Date format conversion - Under development");
        // TODO: Will be developed
    }

    public static void calculateDateDifference(Scanner input) {
        System.out.println("Date difference calculation - Under development");
        // TODO: Will be developed
    }
}