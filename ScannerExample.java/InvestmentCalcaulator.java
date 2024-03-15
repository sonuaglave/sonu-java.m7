import java.util.Scanner;
class InvestmentCalcaulator
{
	public static void main (String [] args)
	{
      Scanner sc= new Scanner(System.in);
      System.out.println("ENTER THE PRINCIPLE : ");
      double principle  =sc.nextDouble ();
      System.out.println("enter the Annual Intersest rate : ");
      double interest = sc.nextDouble ();
      System.out.println("ENTER THE YEAR: ");
      long  year = sc.nextLong();
    //  year =365;
      //year =1;
      System.out.println("addition of investnt calculator");
      double investmentCalcaulator =principle+ ((interest*(principle/100))*year);
      System.out.println("Futur investmet value is : " +investmentCalcaulator);
	}
}