1)Swapping two numbers without using third variable
2)Swapping two numbers using third variable
  
----------------------------------------------------------------------------------------------------------------------------------------------
1)Swapping two numbers without using third variable
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); // 2
        int n2 = sc.nextInt(); // 4
        swap(n1,n2);
    }
    static void swap(int n1, int n2){
        n1 = n1+n2; // 2+4
        n2 = n1-n2; // 6-4 = 2
        n1 = n1-n2; // 6-2 = 4
        System.out.println(n1);
        System.out.println(n2);
    }
}
output
  input 1 : 210
            208
  output : 208
           210

input 2 : 66
          144
  output: 144
          66

  ----------------------------------------------------------------------------------------------------------------------------------------------
  2)Swapping two numbers  using third variable

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); // 2
        int n2 = sc.nextInt(); // 4
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println(n1);
        System.out.println(n2);
    }
}
output
  input 1 : 210
            208
  output : 208
           210

input 2 : 66
          144
  output: 144
          66
  
  ----------------------------------------------------------------------------------------------------------------------------------------------
