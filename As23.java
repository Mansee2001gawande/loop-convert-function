//23) 1	9	25	49	81	…..
import java.util.Scanner;
public class As23 {
    public void method(int no){
        int p;
        for(int i=1;i<=no;i++){
            if(i%2!=0){
              p=i*i;
            System.out.print(" "+p);
        }
    }
 }
}
 class Test{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the num:-");
        int no=sc.nextInt();

        As23 obj=new As23();
        obj.method(no);
    }
 }
