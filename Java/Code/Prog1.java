import java.util.Scanner;
import java.util.Random;

public class Prog1 {
    static void heading(){
        System.out.println("Ethan Saenz\n This program simulates\n" +
        "the Texas Lottery by comparing 6 unique randomly generated numbers\n" +
        "to 6 user entered numbers");
    }

    static int[] generateLottery(int[] arr){
        Random rand = new Random();
        Boolean unique;
        int index = 0;

        while(index != 6){
            unique = true;
            int num = rand.nextInt(54) + 1;
            for(int j = 0; j <= index; j++){
                if(arr[j] == num){
                    unique = false;
                    break;
                }
            }
            if(unique){
                arr[index] = num;
                index++;
            }
        }
        return arr;
    }

    static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] Lottery = new int[6];
        int[] userNums = new int[6];

        Lottery = generateLottery(Lottery);
        printArr(Lottery);

    }
}
