//Left Half Pyramid
import java.util.*;
public class LeftHalfPyramid {
                         public static void main(String[]abc)
                         {
                            int row;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter Number of row");
                            row=sc.nextInt();
                            for(int i=1;i<=row;i++)
                            {
                                for(int j=row;j>i;j--)
                                {
                                    System.out.print(" ");
                                }
                                for(int k=1;k<=i;k++)
                                {
                                                  System.out.print("*");
                                }
                                System.out.println();
                            }
                            sc.close();
                         }
                         
}
/* 
    *
   **
  ***
 ****
*****     (Left Half Pyramid) */
