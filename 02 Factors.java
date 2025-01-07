1)All factors of a Given Number
2)All Prime Factors of a given number

-----------------------------------------------------------------------------------------------------------------------------------------------
1)All factors of a Given Number
  
  import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Invalid Input");
        }
        else {
            factorsOf(n);
        }
    }
    static void factorsOf(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
              System.out.print(i+" "); 
            }
        }
    }
}
output
  input 1 : 18
  output 1 : 1 2 3 6 9 18

  input 2 : -6
  output 2 : invalid input
  
-----------------------------------------------------------------------------------------------------------------------------------------------
2)All Prime Factors of a given number
  
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            n = -n;
        }
        if(n==0){
            System.out.println("Invalid Input");
        }
        else{
            boolean a = true;
            int count = 0;
            for(int i=2; i<=n; i++){
                if(n%i==0){
                    for(int j=2; j<i; j++){
                    if(i%j==0){
                        count++;
                    }
                        
                    }
                    if(count==0){
                    System.out.print(i+" ");
                    a=false;
                    }
                
                }
            }
            if(a){
                    System.out.println("No Prime Factors");
                }
        }
    }
}

output
  input 1 : 18
  output  : 2 3

  input 2 : -10
  output : 2 5

  -----------------------------------------------------------------------------------------------------------------------------------------------
