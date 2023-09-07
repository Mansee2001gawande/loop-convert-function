//37) WAP to check whether entered number is palindrome or not //a number (such as 16461) that remains 
//the same when its digits are reversed.
import java.util.Scanner;
public class As37 {
  public void  method(){
    int rev=0,temp=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no");
    int no=sc.nextInt();
    temp=no;
    while(no!=0){
        int rem=no%10;
        rev=rev*10+rem;
        no=no/10;
    }
    System.out.println(rev);
    if(rev==temp)
    System.out.print("no is palindrome");
    else
        System.out.print("no is not palindrome");

    }
  } 

class Test{
    public static void main(String []args){
        As37 obj =new As37();
        obj.method();
    }
}