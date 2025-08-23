import java.util.*;
class Solution 
{
     int lcmOfNum(int a,int b)
     {
         int g=Math.max(a,b);
         int s=Math.min(a,b);
         for(int i=g;i<=a*b;i+=g)
         {
             if(i%s==0)
             {
                         return i;
             }
         }
         return a*b;
}
}

public class LCMOfTwoNum {
                         public static void main(String[]abc)
                         {
                                                  int a,b;
                                                  Scanner sc=new Scanner(System.in);
                                                  System.out.println("Enter Two numbers to find LCM ");
                                                  a=sc.nextInt();
                                                  b=sc.nextInt();
                                                  Solution ob=new Solution();
                                                  int l=ob.lcmOfNum(a,b);
                                                  System.out.println("LCM of "+a+" "+b+" = "+l);
                                                  sc.close();

                         }
                         
}
