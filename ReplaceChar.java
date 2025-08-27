import java.util.*;
public class ReplaceChar {
                         public static void main(String[]abc)
                         {
                              String str;
                              Scanner sc=new Scanner(System.in);
                              System.out.println("Enter String");
                              str=sc.nextLine();
                              System.out.println("Enter Character to replace with its index value");
                              char ch=sc.next().charAt(0);
                              int index=sc.nextInt();
                              StringBuilder s=new StringBuilder(str);
                              s.setCharAt(index,ch);
                              System.out.println(" String = "+str);
                              System.out.println("Modified String = "+s);
                              sc.close();
                         }
                         
}
