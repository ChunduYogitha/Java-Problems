1)Print the Given number Palindrome or Not
2)Alternative Palindrome Numbers in Range
3)Write a program to the given number is palindrome or not print reverse value of a given number  
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
3)Write a program to the given number is palindrome or not print reverse value of a given number
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        if(n<0){
            System.out.println("Invalid Input");
        }
        else if(n==0){
            System.out.println("Zero");
        }
        else {
            palin(n, rev);
        }
    }
    static void palin(int n, int rev){
        int m = n;
        while(n>0){
            int rem = n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(m==rev){
            System.out.println("Given Number is Palindrome");
        }
        else {
            System.out.println("Reverse of a Given Number is "+rev);
        }
    }
    
}
output
Input 1 : 1698
Output 1 : Reverse of a Given Number is 8961

Input 2 : 2112
Output 2 : Given Number is Palindrome 
 
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- 
