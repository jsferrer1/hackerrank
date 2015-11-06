package collections;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Array1D {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	if (n > 100) {
    		System.exit(0);
    	}
    	
    	// read the list from input
    	int[] a = new int[n]; 
    	for (int i=0; i<n; i++) {
    		a[i] = in.nextInt();
    	}
    	
    	// process the negative sub-arrays
    	String output = "";
    	int countNegative = 0;
    	for (int i=0; i<n; i++) {
    		if (a[i] < 0) {
    			output += String.format("[%d:%d]\n", i, i);
    			countNegative++;
    		}
    		
    		int sum = a[i];
    		for (int k=i+1; k<n; k++) {
    			sum += a[k];
    			if (sum < 0) {
    				output += String.format("[%d:%d]\n", i, k);
        			countNegative++;
    			}
    		}
    	}
		System.out.println(countNegative);
		
    }
}