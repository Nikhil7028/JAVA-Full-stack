package CODING.LOOPS;
// number of factor
public class NumFactor {
  public static void main(String[] args) {
    int num=75;
    int count=0;
    for(int i=1; i<=num/2;i++){
      if (num%i==0) {
        count++;
        System.out.println(i+" "+num/i);
      }
    }
    System.out.println(count);
  }
  
}
