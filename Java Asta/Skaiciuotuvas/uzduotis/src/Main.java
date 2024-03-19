public class Main {
    public static void main(String[] args) {
        int[] nums = new int []{1,2,3,4,5,6,7,8,9,10};
        boolean[] result = numEven(nums);
    }

    private static boolean[] numEven(int[] nums){
        boolean[] evens = new boolean[nums.length];
        System.out.print("The even numbers in your array are:");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                evens[i] = true;
            else {
                evens[i] = false;
            }
            System.out.println(evens[i]);
        }
            return evens;
    }
}

