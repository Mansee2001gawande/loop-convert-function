import java.util.Scanner;
public class As13 {
    void method(){
        int rev=0,no;
        Scanner sc=new Scanner (System.in);
        System.out.print("enter no series :-");
        
        no=sc.nextInt();
        while(no!=0){
            int reminder =no%10;
            rev=rev*10+reminder;
             no=no/10;
            }
            System.out.print(" "+rev);
        }
    public static void main(String []args){
        As13 obj =new As13();
        obj.method();
    }

    
}
