//32) A	b	C	d	E	f	G	h	…… n terms 
import java.util.Scanner;
public class As32 {
    public void method() {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter any character:-");
        char ch=sc.next().charAt(0);
        for(char i=97;i<=ch;i++){
                if(i%2==0)
                System.out.print(" "+i);
            else
            System.out.print(" "+(char)(i -32));
         }
    }
}
    class Test{
        public static void main(String []args){
            As32 obj =new As32();
            obj.method();
        }
    }
