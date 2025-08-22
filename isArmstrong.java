import java.util.*;

class Solution {
    boolean isArmstrong(int num) {
        int temp = num;
        int res = 0;
        int count = 0;

        // count digits
        while (num != 0) {
            num /= 10;
            count++;
        }

        num = temp;

        // calculate sum of powers
        while (num != 0) {
            int rem = num % 10;
            res += Math.pow(rem, count);  
            num /= 10;
        }

        return res == temp;
    }
}

public class isArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check armstrong or not");
        int num = sc.nextInt();

        Solution ob = new Solution(); 
        boolean res = ob.isArmstrong(num);

        if (res) {
            System.out.println(num + " is an Armstrong");
        } else {
            System.out.println(num + " is not an Armstrong");
        }

        sc.close();
    }
}
