import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // System.out.println(prime1(n));

        // System.out.println(prime2(n));

        System.out.println(prime3(n));   
    }


//    *******************************************  Approach - 1   ********************************************


    //  This is the common approach for determining a number is prime or not.
    //  But Time complexity of this approach is O(n) and this the worst time complexity.
    //  Hence we can try to solve this problem whose time complexity is better than this common approach 
    //  and this is the best approach for determining a number is prime or not.

    static boolean prime1(int n) {
        for(int i = 2; i <= n/2; i++) {
            if(n%i == 0) {
                return false;
            }
        }
                return true;
    }



//    *******************************************  Approach - 2   ********************************************



// This is the most efficient approach as compare to "Aproach-1" for determining a number is prime or not.


    static boolean prime2(int n) {
        for(int i = 2; i <= (int)Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
                return true;
    }



//    *******************************************  Approach - 3   ********************************************


// This is the best approach among all above approaches. Because in "Approach-2" we increment by +1 only and
//  we go till Math.sqrt(n) but in this approach we are increment by +6 hence it  is the best than "Approach-2"


    static boolean prime3(int n) {
        if(n==1) {
            return false;
        }
        if(n==2 || n==3) {
            return true;
        }
        if(n%2==0 || n%3==0) {
            return false;
        }
        for(int i = 5; i <= (int)Math.sqrt(n); i = i+6) {
            if(n%i==0 || n%(i+2)==0) {
                return false;
            }
        }
            return true;
    }
}
