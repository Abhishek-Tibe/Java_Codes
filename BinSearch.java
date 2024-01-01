public class BinSearch {
    public static void main(String[] args) {
        int[] numbers = {3,5,41,73,99,125};
        int key = 99;
        int index = binSearch(numbers, key);
        if (index == -1) {
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: " + index);
        }    
    }

    static int binSearch(int num[], int key) {
        int start = 0;
        int end = num.length - 1;
        while (start<=end) {
            int mid = (start + end)/2;
            if (num[mid] == key) {
                return mid;
            }
            if(num[mid] < key) {
                start = mid + 1;
            }
            if(num[mid] > key) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
