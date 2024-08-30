import java.util.Scanner;


public class JavaBasics3 {
    public static void main(String[] args){
        // Prompting user for number.
        System.out.println("Please enter a number:");
        int num = 0;
        // Creating scanner variable to read in input.
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        
        // Looping to print numbers from one to user's number.
        for(int i = 1; i <= num; i++){
            System.out.print(i + " The square is: ");
            System.out.println((int)Math.pow(i, 2));
        }
        
        // Closing scanner.
        scanner.close();
    }
}
