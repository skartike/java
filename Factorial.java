import java.util.Scanner;
 public class Factorial {
    public static void main(String args[]) {
        int num, factorial = 1, i;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an Integer");
        num = sc.nextInt();
        sc.close(); 
        for (i = 1; i <= num; i++){
            factorial = factorial * i;
        }
         System.out.println("Factorial of " + num + " = " + factorial);
    }
}

