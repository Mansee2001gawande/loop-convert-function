//28) 1	2	3	4	 Hello	6	7	8	9	Hello	11	12 ….

import java.util.Scanner;
public class As28 {
    public void method(int no){
        for(int i=1;i<=no;i++){
            if(i%5==0){
                System.out.print(" HELLO");
                }
                else 
                System.out.print(" "+i);
            }
        } 
    
    }
    class Test{
        public static void main(String []args){
         Scanner sc=new Scanner (System.in);
        System.out.print("ENTER THE NO:-");
        int no=sc.nextInt();

            As28 obj=new As28();
            obj.method(no);

        }
    }
