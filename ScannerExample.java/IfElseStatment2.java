import java.util.Scanner;
class IfElseStatment2
{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the boy age : ");
		int age =sc.nextInt() ;
		//int a = 21++;
		System.out.println("he is must have proprty of more than 1cr : ");
		double property= sc.nextDouble ();
		
		System.out.println("enter your surname: ");
		String surname = sc.next().toUpperCase();
		if((age>21 && property>10000000 )||(surname.equals("AMBANI"))){
          System.out.println("YOU ARE ELIGIB");
         
		}
		else 
		{
		   System.out.println("YOUR NOT ELIGIBLE ");
		}
	}
}