package warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    public static void main(String[] args) {
    	
    	try {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    	Scanner in = new Scanner(System.in);
	    	String INFORMAT = "hh:mm:ssa";
	    	String OUTFORMAT = "HH:mm:ss";
	    	
	    	SimpleDateFormat inFormat = new SimpleDateFormat(INFORMAT);
	    	SimpleDateFormat outFormat = new SimpleDateFormat(OUTFORMAT);
	    	
	    	String inputDate = in.next();
	    	Date dt = inFormat.parse(inputDate);
	    	System.out.println(outFormat.format(dt));
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    }
}