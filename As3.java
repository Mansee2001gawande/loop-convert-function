//3) WAP to find out the sum of N natural number.
import java.util.Scanner;
public class As3 {
    public void myMethod (){
        Scanner sc =new Scanner(System.in);
        int sum=0;
        System.out.print("enter a no:-");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("sum of natural no:-"+sum);  
    }
public static void main(String [] args) {
    As3 ob=new As3();
    ob.myMethod();
    }

    }
    

