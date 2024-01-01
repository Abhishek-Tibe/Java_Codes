public class CheckifSorted { 
    public static void main(String[] args) {
        int ar[] = {2,3,14,5,6,7};
        System.out.println(sort(ar));
    }

    static boolean sort(int[] ar) {
        for(int i = 1; i<ar.length; i++) {
            if(ar[i] < ar[i-1]) {
                return false;
            }
        }
        return true;
    }
}
