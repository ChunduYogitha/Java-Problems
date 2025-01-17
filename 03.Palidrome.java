1)Print the Given number Palindrome or Not
2)Alternative Palindrome Numbers in Range  
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1)Print the Given number Palindrome or Not
  
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int rev = 0;
        if(n<=0){
            System.out.println("InvAlid Input");
        }
        else {
            while(n>0){
                int rem = n%10;
                rev = rev*10+rem;
                n=n/10;
            }
            if(rev==m){
                System.out.println("Palindrome");
            }
        else { 
            System.out.println("Not a Palindrome");
        }
        }
       
    }
}
output
input 1 : 1698
output 1 : Not Palindrome

input 2 : 2112
output 2 : Palindrome

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
2)Alternative Palindrome Numbers in Range
  
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int count = 0;
        boolean a = false;
        boolean b = true;
        if(n<=0 || n1<=0){
            System.out.println("InvAlid InPUts");
        }
        else {
            if(n>n1){
                int temp = n;
                n=n1;
                n1=temp;
            }
            for(int i=n;i<=n1;i++){
                int j = i;
                int rev = 0;
                while(j>0){
                    int rem = j%10; //100%10=0 , 0 , 1 
                    rev = rev*10+rem; //0*10+0=0 , 0, 1
                    j=j/10; // 10, 1, 0
                }
                if(i==rev){
                    a = true;
                 if(count%2==0){
                     if(b){
                         System.out.print(i);
                         b = false;
                     }
                     else{
                        System.out.print(", "+rev);
                     }
                }
                count++;
                
                }
            }
            if(!a){
            System.out.println("No Palindrome Values");
        }
        if(a){
            System.out.print(".");
        }
        }
        
    }
}

output 
Input 1 : 100
          200
Output 1 : 101, 121, 141, 161, 181.

 Input 2 : -33
            20
 Output 2 : InvAlid InPUts

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
