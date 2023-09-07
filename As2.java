////2) WAP to print N natural number.  
import java .util.Scanner;
public class As2 {
    public void myMethod(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i);
        }
    }
        public static void main (String[] args){
            As2 ob=new As2(); 
            ob.myMethod ();
            }
        }
    
        
    
    

