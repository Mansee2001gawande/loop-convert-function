//25) 1	27	125	343	…………	
import java.util.Scanner;
public class As25 {
    public void method(){
        int p;
        Scanner sc=new Scanner (System.in);
        System.out.print("enter a no:=");
        int no=sc.nextInt();
        for(int i=1;i<=no;i++){
            if(i%2!=0){
             p=i*i*i;
            System.out.print(" "+p);
            }
         }
     }
}
class Test{
    public static void main(String []args){
        As25 object=new As25();
         object.method();

    }
}
