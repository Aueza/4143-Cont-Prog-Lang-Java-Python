import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Prog1 {
    // function to print heading to output.
    static void heading(){
        System.out.println("Ethan Saenz\n This program simulates\n" +
        "the Texas Lottery by comparing 6 unique randomly generated numbers\n" +
        "to 6 user entered numbers");
    }

    // function to generate lottery array
    static int[] generateLottery(){
        Random rand = new Random();
        Boolean unique;
        int index = 0;
        int arr[] = new int[6];

        // continue generating/filling until 6 unique numbers are made.
        while(index != 6){
            unique = true;
            int num = rand.nextInt(54) + 1;
            for(int j = 0; j <= index; j++){
                if(arr[j] == num){
                    unique = false;
                    break;
                }
            }
            // if unique, add to array
            if(unique){
                arr[index] = num;
                index++;
            }
        }
        return arr;
    }

    //function to request/store users numbers.
    static int[] requestNums(){
        //declaring scanner and temp array.
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[6];
        System.out.println("Please enter 6 numbers, separated by spaces.");
        for(int i = 0; i < 6; i++){
            int n = scan.nextInt();
            arr[i] = n;
        }
        return arr;
    }

    // function to print an array.
    static void printArr(int[] arr){
        for(int num : arr)
            System.out.print(num + " ");

        //print new line for syntax
        System.out.println();
    }

    //function to compare arrays, return num of matches.
    static int compare(int[] lott, int[] user){
        int matches = 0;
        // iterating over each number in arrays
        Arrays.sort(lott);
        Arrays.sort(lott);
        // comparing nums
        for(int lottNum : lott){
            for(int userNum : user){
                if(lottNum == userNum){
                    matches++;
                    break;
                }
            }
        }
        return matches;
    }
    // main function
    public static void main(String[] args){
        // declaring arrays, matches 
        int[] Lottery = new int[6];
        int[] userNums = new int[6];
        int matches = 0;

        // generating arrays
        Lottery = generateLottery();
        userNums = requestNums();
    
        // calulating matches, printing result
        matches = compare(Lottery, userNums);
        System.out.println("You have " + matches + " matches!");

    }
}
