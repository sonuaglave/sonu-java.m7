//upper case 
import java.util.scanner;
class ScannerExample1
{
  public static void main(String[]args){
   
   
    Scanner sc =new Scanner (System.in);
    System.out.print("enter your name: ");
    string name=sc.next();
    char ch=name.charAt(0);
    System.out.println("hi my name is "+name+"and my first characteris "+ch);
    

    if (ch=='a' || ch=='e' || ch =='i' || ch =='o' || ch=='u')
   {
    System.out.println("Chararcter "+ch +"is avowel.");

  
   }else{
              System.out.println("Chararcter "+ch +"is consonent.");

        }
   
}



}