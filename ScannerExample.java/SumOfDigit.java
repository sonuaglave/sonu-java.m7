import java.util.Scanner;

class SumOfDigit
{
  public static void main (String []args) 
 {
   Scanner sc =new Scanner (System.in);
   System.out.println("enter the number: ");
   int num =sc .nextInt();
   int dup=num;
   int sum=0;
   sum=sum + num % 10;
   num=num/10;
   sum=sum+num%10;
   num =num/10;
   sum=sum+num%10;
   System.out.println("sum of digit is" +sum+ "and the num is -" +dup);

  }

}