import java.util.*;
class Solution 
{
       int factorial(int num)
       {
                         if(num==1)
                         {
                                                  return 1;
                         }
                         else{
                                 return num*factorial(num-1);
                         }
       }
}
public class FactorialRecursive {
                 public static void main(String[]abc)
                 {
                         int n;
                         Scanner sc=new Scanner(System.in);
                         System.out.println("Enter Number to print Factorial of num");
                         n=sc.nextInt();
                         Solution ob=new Solution();
                         int f=ob.factorial(n);
                         System.out.println("Factorial of "+n+" = "+f);
                         sc.close();


                         
}
}
