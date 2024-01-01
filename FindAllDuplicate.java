// import java.util.ArrayList;
// import java.util.List;

public class FindAllDuplicate {
    public static void findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                System.out.print(nums[index] + " ");
            }
        }
    }

    static void swap(int nums[], int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 3, 2, 7, 8 };
        findDuplicates(nums);
    }
}
