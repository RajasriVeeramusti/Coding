import java.util.Scanner;
public class SumAverageInt
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int lowerbound=sc.nextInt();
  int upperbound=sc.nextInt();
  int sum=0;
  double count=0;
  for(int i=lowerbound;i<=upperbound;i++)
  {
   sum+=i;
   count++;
  }
   double avg=(double)sum/count;
   System.out.println("The sum of "+lowerbound+" to "+upperbound+" is "+sum);
   System.out.println("The Average is" +avg);
 }
}
 