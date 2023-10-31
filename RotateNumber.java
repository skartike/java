import java.util.Scanner;
public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Enter the number of rotations: ");
        int rotations = sc.nextInt();
        System.out.println("The rotated number is: " + rotateNumber(number, rotations));
    }
    public static int rotateNumber(int number, int rotations){
        int[] digits = new int[10];
        int count = 0;
        while(number !=0){
            digits[count++] = number % 10;
            number /= 10;
        }
        for(int i = 0; i<rotations; i++){
            int lastDigit = digits[count -1];
            for(int j = count-1; j>0; j--){
                digits[j] = digits[j-1];
            }
            digits[0] = lastDigit;
        }
        int rotatedNumber = 0;
        for(int i = count-1; i>=0; i--){
            rotatedNumber += digits[i] * Math.pow(10,i);
        }
        return rotatedNumber;
    }
}

    
