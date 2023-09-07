//19) 1	+	1/2	+	1/3	+	1/4	+	1/5	….. n terms(find out sum)
import java.util.Scanner;
public class As19 {
   public void m1(){
     float sum=0,b=1,c;
    Scanner sc= new Scanner (System.in);
    System.out.println("enter a no");
    int no=sc.nextInt();
    for(int a=1;a<=no;a++){
          c=1.0f/a;
         sum=sum+c;
    }
    System.out.print(" "+sum);


}
    public static void main(String []args){
        As19 obj=new As19();
        obj.m1();
    }
   
}
