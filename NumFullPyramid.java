import java.util.*; 
public class NumFullPyramid {
                         public static void main(String[]abc)
                         {
                            int row;
                            int num=1;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the number of rows");
                            row=sc.nextInt();
                            for(int i=1;i<=row;i++)
                            {
                                for(int j=row;j>i;j--)
                                {
                                                  System.out.print(" ");
                                }
                                for(int k=1;k<=i;k++)
                                {
                                   System.out.print(num+" ");
                                }
                                num++;
                                System.out.println();
                            }
                            sc.close();
                         }
                         
}
/*     
Enter the number of rows
5
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5     (Number Full Pyramid) */
