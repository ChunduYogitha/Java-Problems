1)Reversing of number using while
2)Reverse of a Given Number using Functions
  
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1)Reversing of number using while
  
  public class Main{
    public static void main(String[] args){
        int n = 123;
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        System.out.println(rev);
    }
}

output : 321
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- 
2)Reverse of a Given Number using Functions
  
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("InValid Input");
        }
        else {
            System.out.println(Reverse(n));
        }
    }
    static int Reverse(int n){
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev*10+rem;
            n=n/10;
        }
        return rev;
    }
}
output : 
Input 1 : 1698
output 1 : 8961

Input 2 : 1004
output 2 : 4001

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- 
