 import java.util.*;

public class CalendarDay {
    public static String findDay(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);  
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", 
                          "THURSDAY", "FRIDAY", "SATURDAY"};
        return days[dayOfWeek - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        String result = findDay(year, month, day);
        System.out.println("The day of the week is: " + result);
    }
}

