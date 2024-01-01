public class ArraysMaxSubarraySum {


    // ************************************* Naive(Common) Approach ******************************************

    static void maxSum(int[] num) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                currsum = 0;
                for (int k = i; k <= j; k++) {
                    currsum = currsum + num[k];
                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("The maximum sum is: " + maxsum);
    }



    // **************************************** Kadanes Algorithm *******************************************



    public static void kadanes(int num[]) {
        int maxsum = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < num.length; i++) {
            cs = cs + num[i];
            if(cs < 0) {
                cs = 0;
            }
            if(maxsum < cs) {
                maxsum = cs;
            }
        }
        System.out.println("Maximum sum is : " + maxsum);
    }

    public static void main(String[] args) {
        int num[] = {-2, -5, 4, -1, -2, 1, 5, -3};
        // maxSum(num);
        kadanes(num);
    }
}