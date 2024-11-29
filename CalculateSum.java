import java.util.Scanner;
public class CalculateSum{
 public static int CalculateSum(int a,int b){
 return a+b;
 }
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int a =sc.nextInt();
  int b=sc.nextInt();
 int sum = CalculateSum(a,b);
  System.out.println("The sum of 2 numbers is: "+sum);
  }
  }
 