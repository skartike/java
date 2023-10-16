 import java.util.Scanner;
    public class Hollowsquare {
      public static void main(String[] args) {
    
        //Getting the size of the square side from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the stars in each side of square: ");
        int sideSize = sc.nextInt();
        sc.close();
    
        System.out.println("Hollow Square Star Pattern: ");
    
        for (int i = 0; i < sideSize; i++ )
        {
          for (int j = 0 ; j < sideSize; j++ )
          {
            if (i == 0 || i == sideSize - 1 || j == 0 || j == sideSize - 1)
            {
              System.out.print("*"+" ");
            }
            else {
              // Double spaces are to accommodate space between the stars
              // For example, when square side size is 5, the total spaces
              // in 2nd row, between  first and last star are:
              // 7 (3 for stars + 4 for spaces between stars)
              System.out.print(" "+ " ");
            }
          }
          //To move the cursor to new line
          System.out.println();
        }
      }
    }
    

