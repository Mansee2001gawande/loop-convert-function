//7) WAP to check whether entered number is prime or not
public class As7 {
    boolean  method(int no){
        boolean flag=true;
        for(int i=2;i<=no/2;i++){
            if(no%i==0){
                flag= false;
                break;
            }
        }
            if(no>0 && flag){
                 return true;
            }
           
            else{
                 return flag;
        
            }
        }
      
     
        public static void main(String [] args){
            As7 obj=new As7();
            for(int i=2;i<=100;i++){
                if(obj.method(i)){
                    System.out.print(" "+i);
                }
            }
            
        }
    }
    
    
    
