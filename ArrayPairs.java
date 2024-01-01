public class ArrayPairs {

    static void calculatePairs(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
       
        System.out.println("Total pairs is: " + tp);
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,9};
        calculatePairs(num);
    }
}
