package strings;

import java.io.*;
import java.util.*;

public class Intro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len = A.length()+B.length();
        System.out.println(len);
        
        if (A.length() > B.length()) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
        
        System.out.println(capitalize(A) + " " + capitalize(B));
    }
    
    public static String capitalize(String s) {
    	if (s.length() == 0) {
    		return s;
    	}
    	return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }
}