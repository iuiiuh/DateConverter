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
    try {
        System.out.println("\n=== Calculate Date Difference ===");
        
        System.out.print("Enter first date (YYYY-MM-DD): ");
        String dateStr1 = input.next();
        
        System.out.print("Enter second date (YYYY-MM-DD): ");
        String dateStr2 = input.next();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse(dateStr1);
        Date date2 = sdf.parse(dateStr2);
        
        long diffInMillis = Math.abs(date2.getTime() - date1.getTime());
        long diffInDays = TimeUnit.DAYS.convert(diffInMillis, TimeUnit.MILLISECONDS);
        
        System.out.println("Difference between dates: " + diffInDays + " days");
        
    } catch (Exception e) {
        System.out.println("Error in date format! Use YYYY-MM-DD");
    }
}
}
