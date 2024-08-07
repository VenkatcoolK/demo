public class Demo {

    public static void main(String[] args) {


        int nums[] = new int[5];

        nums[0] = 4;
        nums[1] = 10;
        nums[2] = 6;
        nums[3] = 7;
        nums[4] = 9;

//        for (int i = 0; i < nums.length; i++) {
//
//            System.out.println(nums[i]);
//
//        }
        for (int i : nums) {

            System.out.println(nums[i]);

        }
    }
}