import java.util.Scanner;
class CostOfDrive
{
  public static void main(String[] args) {
  	Scanner sc = new Scanner (System.in);
  	System.out.println("enter the distance");
  	double distance = sc.nextDouble();
  	System.out.println("enter the mile");
  	double mile =sc.nextDouble ();
  	
  	System.out.println("enter the total cost : ");
  	double totaCost = (mile*distance)/100;
  	System.out.println("total travel distance= "+totaCost);

  }
}
