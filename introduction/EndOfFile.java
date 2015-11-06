package introduction;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	String input = "";
    	int n = 1;
    	String output = "";
    	while(in.hasNextLine()) {
    		if (in.hasNext()) {
    			output += n + " " + in.nextLine() + "\n";
    			n++;
    		}
    	}
    	System.out.println(output);
    	
    }
}