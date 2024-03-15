import java.util.Scanner;
class AlphabateOrNotAlphabate
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.print ("Enter the charater : ");
    char ch= sc .next().charAt.(0);
    System.out.println(((ch>='A'&&ch<='z')||(ch>='a'&&ch<='z'))?(((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))?"Uppercase":"Lowercase"):"NOtAlphabate");


  }

}