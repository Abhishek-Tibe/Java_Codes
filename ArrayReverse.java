public class ArrayReverse {

    static void reverse(int numbers[]) {
        int start = 0 , end = numbers.length -1;
        while(start < end) {
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int num[] = {2,65,43,8};
        reverse(num);

        for(int i=0; i<num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
