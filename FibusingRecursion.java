public class FibusingRecursion {
    public static void main(String[] args) {
        // System.out.println(fibo(48));
        // System.out.println(sum(5));
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int target = 4;
        System.out.println(bst(arr, target, 0, arr.length - 1));
    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    static int sum(int n) {
        if (n == 1) {
            return n;
        }
        return sum(n - 1) + sum(n - 2);
    }

    static int bst(int arr[], int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = (s + e) / 2;
        if (arr[m] == target) {
            return m;
        }

        if (target < arr[m]) {
            return bst(arr, target, s, e - 1);
        }
        return bst(arr, target, s + 1, e);

    }
}
