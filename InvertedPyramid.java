import java.util.*;
public class InvertedPyramid {

                         public static void main(String[]abc)
                         {
                                                  int row;
                                                  Scanner sc=new Scanner(System.in);
                                                  System.out.println("Enter the number of row");
                                                  row=sc.nextInt();
                                                  for(int i=1;i<=row;i++)
                                                  {
                                                      for(int j=1;j<i;j++)
                                                      {
                                                            System.out.print(" ");
                                                      }
                                                      for(int k=row;k>=i;k--)
                                                      {
                                                                           System.out.print("*"+" ");
                                                      }
                                                      System.out.println();
                                                  }
                                                  sc.close();
                         }
}

/*     Enter the number of row
5
* * * * * 
 * * * * 
  * * * 
   * * 
    *       (Inverted Pyramid)*/
