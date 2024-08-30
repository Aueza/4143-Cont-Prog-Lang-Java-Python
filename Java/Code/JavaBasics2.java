import java.util.Scanner;

public class JavaBasics2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();

        // Checking for zero.
        if (num == 0){
            System.out.println("Your number is zero!");
        }

        // If branch is num is positive.
        if (num > 0){
            if (num % 2 == 0){
                System.out.println("Your number is positive and even!");
            }
            else{
                System.out.println("Your number is positive and odd!");               
            }
        }
        // If branch is num is negative.     
        if (num < 0){
            if (num % 2 ==0){
                System.out.println("Your number is negative and even!");
            }
            else{
                System.out.println("Your number is negative and odd!");
            }
        }
        
        
        // Closing scanner.
        scanner.close();
    }
    
}
