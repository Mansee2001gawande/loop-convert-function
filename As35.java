//1) WAP to count number of digits
import java.util.Scanner;
public class As35 {
    void method(){
        int digit=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no:-");
        int no=sc.nextInt();
        while(no/2!=0){
            no=no/10;
            digit++;
         }
         System.out.print("count of result:-"+digit);
    }
}
class Test{
    public static void main(String []args){
        As35 obj=new As35();
        obj.method();
    }
}

    

