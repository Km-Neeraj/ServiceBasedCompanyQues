import java.util.*;
class Solution {
                      String reverseString(String s)
                      {
                            int len=s.length();

                            String res="";
                            for(int i=len-1;i>=0;i--)
                            {
                              res=res+s.charAt(i);
                            }
                          return res;
                      }
}
public class ReverseString {
                         public static void main(String[]abc)
                         {
                                                  String str;
                                                  Scanner sc=new Scanner(System.in);
                                                  System.out.println("Enter String ");
                                                  str=sc.next();
                                                  Solution ob=new Solution();
                                                  String res=ob.reverseString(str);
                                                  System.out.println("Reverse of "+str+" = "+res);
                                                  sc.close();
                         }
                         
}
