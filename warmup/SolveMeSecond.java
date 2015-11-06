package warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolveMeSecond {


    static int solveMeSecond(int a, int b) {
      // Hint: Type return a+b; below
      return a+b;
   }

   
 public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 int t, a, b, sum;
	 String sSum = "";
	 
	 t = in.nextInt();
	 
	 for (int i=0; i<t; i++) {
		 a = in.nextInt();
		 b = in.nextInt();
		 sum = solveMeSecond(a, b);
		 sSum += sum + "\n";
	 }
	 System.out.println(sSum);
   }
}
