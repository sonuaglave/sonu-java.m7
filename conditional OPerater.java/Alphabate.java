import java.util.Scanner;
class Alphabate
{
  public static void main(String [] args )
  {
     Scanner sc = new Scanner (System.in);
     System.out.print("enter the character: ");
     char ch = sc.next ().charAt(0);
     System.out.println(((ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z'))?"alphabate ":" not alphabate");

  }


}