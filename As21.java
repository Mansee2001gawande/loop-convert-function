//21) 1,	4,	9,	16,	25	…..
import java.util.Scanner;
public class As21 {
    public void m1(){
        int b=1,c;
        Scanner sc=new Scanner (System.in);
        System.out.print("ENTER A NO");
        int no= sc.nextInt();
        for(int i=1;i<no;i++){
             c=i*i;           
            System.out.print(" "+c);
        }
    }
}
class Test{
    public static void main(String[]args){
        As21 obj=new As21();
        obj. m1();
    }
} 


