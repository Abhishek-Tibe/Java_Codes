import java.util.Scanner;

public class Funct {
    public static void main(String[] args) {
        for(int i = 1; i < 14; i++) {
               sum();
        }
            
            // System.out.println(greet());
    }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        int add = num1 + num2;
        System.out.println("Addition is: "+ add);
    }

    // static String greet() {
    //     String greeting = "How are you";
    //     return greeting;
    // } 
}

