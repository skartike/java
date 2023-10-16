import java.util.Scanner;

public class Percentage {

    public static void main(String[] args) {
        System.out.println("Taking Input from the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int a = sc.nextInt();
        System.out.println("Enter Number 2");
        int b = sc.nextInt();
        System.out.println("Enter Nymber 3");
        int c = sc.nextInt();
        System.out.println("Enter Number 4");
        int d = sc.nextInt();
        System.out.println("Enter Number 5");
        int e = sc.nextInt();
        int sum = a +b +c +d +e;
        System.out.println("Sum of these Numbers is");
        System.out.println(sum);
        double percent = (sum/5)*100;
        System.out.println("Percentage Of Student is");
        System.out.println(percent);
        sc.close();



    }
    
}
