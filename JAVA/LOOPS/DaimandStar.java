package JAVA.LOOPS;
import java.util.Scanner;
//    *       print his pattern
//   ***
//  *****
// *******
//  *****
//   ***
//    *

public class DaimandStar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num : ");
    int num = sc.nextInt();


    int numSpace=num/2;
    int numStar=1;


    for (int i = 0; i < num; i++) {
      for (int j = 0; j < numSpace; j++) {
        System.out.print(" ");
        
      }
      for (int k = 0; k < numStar; k++) {
        System.out.print("*");
        
      }
      if (i<num/2) {
        numSpace-=1;
        numStar+=2;        
      } else{
        numSpace+=1;
        numStar-=2;
      }
     
      
      
      
      System.out.println();
    }

    
  
  }
}
