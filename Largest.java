public class Largest {
    public static void main(String[] args) {
        int numbers[] = {2,5,314,7,34,56,24,45};
        System.out.println("Largest value is: " + llargest(numbers));
    }

    static int llargest(int num[]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 1; i < num.length; i++) {
            if(num[i] > largest) {
                largest = num[i];
            }
        }
        return largest;
    }
}
