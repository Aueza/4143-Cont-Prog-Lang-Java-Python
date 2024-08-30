import java.util.Scanner;

public class JavaBasics4 {
    public static void main(String[] args){
        // Prompting user for name.
        Scanner scanner = new Scanner(System.in);
        String fname, lname;
        System.out.println("Please enter your first name: ");
        fname = scanner.nextLine();
        System.out.println("Please enter your last name: ");
        lname = scanner.nextLine();

        // Checking for equality.
        if (fname.equals(lname)){
            System.out.println("No way! Right?");
        } else {
            System.out.println("Hello " + fname + " " + lname);
        }
        
        // Closing scanner.
        scanner.close();
    }
}
