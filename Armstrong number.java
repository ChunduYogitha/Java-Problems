1)Print the number is Armstrong or not
2)Print the Armstrong numbers from 1 to 1000

1)Print the number is Armstrong or not  
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = num1;
        int sum = 0;
        while(num1>0){
            int rem = num1%10;
            int num = rem*rem*rem;
            num1 = num1/10;
            sum += num;
        }
        if(num2==sum)
            System.out.println("is Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
/*
input:153
  is Armstrong
*/

2)Print the Armstrong numbers from 1 to 1000
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        for(int num1=1; num1<=1000; num1++){
            int num2 = num1;
            int sum = 0;
          while(num1>0){
              int rem = num1%10;
              int num = rem*rem*rem;
              num1 = num1/10;
              sum += num;
          } 
          if(num2 == sum){
              System.out.println(num2 + " is Armstrong");
          }
          num1=num2;
        }
    }
}
/*
1 is Armstrong
153 is Armstrong
370 is Armstrong
371 is Armstrong
407 is Armstrong
*/
