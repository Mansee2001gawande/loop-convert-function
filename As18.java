//18) 1	2	2	4	8	32	…… n terms
import java.util.Scanner;
    public class As18 {
    void method(){
        int a=1,b=2,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a NO:-");
        int no=sc.nextInt();

        for(int i=1;i<=no;i++){
                c=a*b;
                System.out.print(" "+a);
                a=b;
                b=c;
            }
        }
        public static void main(String []args){
            As18 obj=new As18();
            obj.method();
        }
    }

