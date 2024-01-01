public class RemoveDuplicateFromSortedArray {

    static int duplicate(int arr[]) {
        int j = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,3,3,4,6,6};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int rd = duplicate(arr);
        for (int i = 0; i < rd; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
