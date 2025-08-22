
import java.util.*;
class Solution 
{
      boolean isPerfect(int num)
      {
        int n=num/2;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
             if(num%i==0)
             {
                sum=sum+i;
             }
        }
        if(sum==num)
        {
                         return true;
        }
        return false;
      }
}
public class CheckPerfectNumber {
                         public static void main(String[]abc)
                         {
                              int num;
                              Scanner sc=new Scanner(System.in);
                              System.out.println("Enter Number To check Perfect or not");
                              num=sc.nextInt();
                              Solution ob=new Solution();
                              boolean p=ob.isPerfect(num);
                              if(p==true)
                              {
                                    System.out.println(num +" is a perfect Number");
                              }
                              else{
                                                  System.out.println(num+" is not a perfect number");
                              }

                         }
                         
}
