import java.util.Scanner;
 
public class Countdigits {
    public static void main(String[] args) {
        int number, count = 0, a;


        Scanner scan = new Scanner(System.in);
 
        System.out.println("Enter an Integer");
        number = scan.nextInt();
 
        a = number;
        while (a != 0) {
            a = a / 10;
            ++count;
        }
 
        System.out.format("Number of Digits in %d = %d", number, count);
           scan.close();
    }
}