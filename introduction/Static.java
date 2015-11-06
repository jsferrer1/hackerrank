package introduction;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Exception;

public class Static {
	public static boolean flag = false;
	
	public static void main(String[] args) throws Exception{
		
		try {
			Scanner in = new Scanner(System.in);
			
			int B = in.nextInt();
			int H = in.nextInt();
			if (B > 0 && H > 0) {
				flag = true;
			} else {
				throw new Exception("java.lang.Exception: Breadth and height must be positive");
			}
			if(flag){
				int area=B*H;
				System.out.println(area);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
	}//end of main

}//end of class
	
