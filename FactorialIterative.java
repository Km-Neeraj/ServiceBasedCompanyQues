import java.util.*;
public class FactorialIterative {

                         static int factorial(int num)
                         {
                             int fact=1;
                             for(int i=1;i<=num;i++)
                             {
                                 fact=fact*i;
                             }
                             return fact;
}
                         
                         
public static void main(String[]abc)
{
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number to find factorial");
      n=sc.nextInt();
      System.out.println("Factorial of "+n+" = "+factorial(n));
      sc.close();
}
                         
}
