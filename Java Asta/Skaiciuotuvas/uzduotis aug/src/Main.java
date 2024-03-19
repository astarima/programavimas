import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int[] nums = new int[] {1,2,3,4,5};
//        int[]reversed = reverse(nums);
//
//        for(int x : reversed) {
//            System.out.println(x);
//        }

        Scanner scanner = new Scanner(System.in);
        int answer = new Random().nextInt(101);

        int quess;
        while (true) {

            quess = scanner.nextInt();
            if (quess == answer) {
                System.out.println("Correct");
                break;
            }
            else if(quess > answer){
                System.out.println("Less");
            }
            else {
                System.out.println("More");
            }



        }

    }


    private static int[] reverse(int[] nums) {
        int[] reversed = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            reversed[nums.length - i - 1] = nums[i];
        }
        return reversed;
    }


}