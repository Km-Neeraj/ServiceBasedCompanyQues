import java.util.*;
public class SumOfDigits {
  public static void main(String[]abc)
  {
                         int num;
                         Scanner sc=new Scanner(System.in);
                         System.out.println("Enter number to find sum of its digits");
                         num=sc.nextInt();
                         int temp=num;
                         int rev=0;
                         while(num!=0)
                         {
                             int rem=num%10;
                             rev=rev+rem;
                             num/=10;
                         }
                         System.out.println("Sum of digits of "+temp+" = "+rev);
                         sc.close();
}  
}
