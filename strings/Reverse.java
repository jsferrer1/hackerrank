package strings;

import java.io.*;
import java.util.*;
import java.lang.*;

public class Reverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        /* Enter your code here. Print output to STDOUT. */
        String B = new StringBuilder(A).reverse().toString();
        
        if (A.equals(B)) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
        
    }
}