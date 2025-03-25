package CODING.LOOPS;
// Reverse the given number 142
public class ReverseNum {
  public static void main(String[] args) {
    int num=-142;
    int temp = num;
    while (temp!=0) {
      int rem= temp%10;
      System.out.print(rem);
      temp=temp/10;      
    }
  }
  
}
