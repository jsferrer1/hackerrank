package warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AVeryBigSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	
    	long sum = 0L;
    	int n = in.nextInt();
    	for (int i=0; i<n; i++) {
    		sum += in.nextLong();
    	}
    	System.out.println(sum);
    }
}