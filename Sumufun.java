import java.util.Scanner;

public class Sumufun {
    public static void main(String args[]) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
         n = sc.nextInt();
         sc.close();
         for(int i =1; i<=n; i++) {
            sum+=i;
         }
         System.out.println(" The sum of first " + n + " numbers is " + sum);
    }
}
