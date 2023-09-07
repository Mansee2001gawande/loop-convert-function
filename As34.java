//34) WAP to check whether entered number is perfect or not(a positive integer that is equal to the sum of
// its proper divisors.     6=1+2+3,28, 496, and 8,128.)
import java.util.Scanner;
public class As34 {
    void method(){
        int sum=0;
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the no:-");
        int no=sc.nextInt();

        for(int i=1;i<=no/2;i++){
            if(no%i==0){
                sum=sum+i;
            }
        }
    

            if(sum==no){
            System.out.print("no is perfect"+ no);
              }  else {
            System.out.print("no is not perfect"+ no);}
             }

     }

class Test{
    public static void main(String []args){
        As34 obj=new As34();
        obj.method();
    }
}

