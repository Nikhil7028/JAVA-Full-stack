package JAVA.LOOPS;
import java.util.Scanner;
// *****     print this pattern
// *****
// *****
// *****
// *****
public class SquareStar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num : ");
    int num = sc.nextInt();
    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        System.out.print("*");
        
      }
      System.out.println();
      
    }
  }
  
  
}
