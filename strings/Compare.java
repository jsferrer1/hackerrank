package strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class Compare {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	 Scanner sc=new Scanner(System.in);
    	 String input = sc.next();
    	 int len = sc.nextInt();
    	 //String[] arr = new String[50]; 
    	 List<String> arr = new ArrayList<>();
    	 for (int i=0; (i+(len-1))<input.length(); i++) {
    		 String s = input.substring(i, i+(len));
    		 arr.add(s);
    		 System.out.println(s);
    	 }
    	 //Arrays.sort(arr.toArray());
    	 Collections.sort(arr);
    	 System.out.println("sorted:" +arr.size());
    	 System.out.println(arr.toString());
    	 System.out.println("first & last:");
    	 System.out.println(arr.get(0));
    	 System.out.println(arr.get(arr.size()-1));
    	 //for (int i=0; i<arr.size(); i++) {
    	 //	 System.out.println(arr.get(i));
    	 //}
    }
}