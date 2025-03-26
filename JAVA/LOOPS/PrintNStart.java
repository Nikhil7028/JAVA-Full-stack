package JAVA.LOOPS;

import java.util.Scanner;

public class PrintNStart {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num : ");
    int num = sc.nextInt();
    for (int i = 0; i < num; i++) {
      System.out.print("*");
      
    }
  }
  
}
