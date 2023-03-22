import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
         // 1st condition 
        System.out.println(A.length() + B.length());
        
        // 2nd condition 
        if(A.compareTo(B)>B.compareTo(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        // 3rd condition 
        String s1 = A.substring(0, 1).toUpperCase();
        String s2 = B.substring(0, 1).toUpperCase();

        System.out.println(s1 + A.substring(1) + " " + s2 + B.substring(1));
    }
}



