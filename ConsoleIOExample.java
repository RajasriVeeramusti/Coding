import java.util.Scanner;
public class ConsoleIOExample {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        System.out.println("You entered: " + userInput);
        scanner.close();       
}
}
