import java.util.Scanner;
public class pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the square");
        int size = sc.nextInt();
        for(int line=1;line<=size;line++)
    {
        for(int star=1;star<=size;star++){
        System.out.print("*");
    }
    System.out.println();
    }
    sc.close();
}}
