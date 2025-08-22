import java.util.*;
public class TotalDigits {
                         public static void main(String[]abc)
                         {
                             int n;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter Number to count digits");
                             n=sc.nextInt();
                             int count=0;
                             int temp=n;
                             while(n!=0)
                             {
                                n=n/10;
                                count++;
                             }
                             System.out.println("Total Number of digits in number "+temp+" = "+count);
                             sc.close();
                         }
                         
}

/*     
Enter Number to count digits
1234
Total Number of digits in number 1234 = 4 */
