import java.util.Scanner;

public class JavaBasics5 {
    public static void main(String [] args){
        // Define scanner to read input, int variables.
        Scanner scanner = new Scanner(System.in);
        int numPeople = 0;
        int numPizzas = 0;

        // Prompt user for info.
        System.out.println("How many people will be attending the party?");
        numPeople = scanner.nextInt();
        System.out.println("And how many pizzas will be ordered?");
        numPizzas = scanner.nextInt();

        int slices = numPizzas * 8;
        int perPerson = slices / numPeople;
        int leftover = slices % numPeople;
        System.out.println("Each person can have " + perPerson + " slices.");
        System.out.println("There will be " + leftover + " leftover slices.");

        




        // Closing scanner.
        scanner.close();
    }
}
