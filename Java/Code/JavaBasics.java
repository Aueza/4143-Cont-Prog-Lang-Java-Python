import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        // Prompting user for number.
        System.out.println("Please enter a number:");
        int num = 0;
        // Creating scanner variable to read in input.
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        
        // Looping to print numbers from one to user's number.
        for(int i = 1; i <= num; i++){
            System.out.println(i);
        }
        
        // Closing scanner.
        scanner.close();
    }
}
