//20) 0	7	14	21	28	35	…..
import java.util.Scanner;
 class As20 {
    public void m2 (int no){
        for(int i=0;i<=no;i++){
             int mult=i*no;
            System.out.print(" "+mult);
            }
     }
 }
class Test{
public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    System.out.print("enter the no");
     int no=sc.nextInt();

        As20 obj= new As20();
        obj.m2(no);
        }
    }

