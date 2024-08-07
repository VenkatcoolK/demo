public class MyArrayList {

    public static void main(String[] args) {

        int num[] = {5,6,3,8};


        //Array of array

//        int nums[][] = new int[10][5];
//
//        for (int i = 0; i<10; i++)
//        {
//            for (int j=0; j<5; j++)
//            {
//                nums[i][j] = (int)(Math.random() * 10);
//            }
//
//        }

        int nums[][] = new int[5][5];

        for (int i = 0; i<nums.length; i++)
        {
            for (int j=0; j<nums[i].length; j++)
            {
                nums[i][j] = (int)(Math.random() * 10);
            }

        }

        for (int n[] : nums)
        {

            for (int m: n)
            {

                System.out.print(m + " ");

            }
            System.out.println();



        }



//        for (int i = 0; i<10; i++)
//        {
//            for (int j=0; j<5; j++)
//            {
//                System.out.print(nums[i][j] + " ");
//            }
//            System.out.println();
//
//        }


    }



}
