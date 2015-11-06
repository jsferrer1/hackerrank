package strings;

import java.io.*;
import java.util.*;

public class Anagrams {

   static boolean isAnagram(String A, String B) {
      //Complete the function
	   char[] word1 = A.toLowerCase().toCharArray();
	   char[] word2 = B.toLowerCase().toCharArray();
   
	   Arrays.sort(word1);
	   Arrays.sort(word2);
	   
	   String w1 = new String(word1);
	   String w2 = new String(word2);
	   //System.out.println(w1);
	   //System.out.println(w2);
	   return (w1.equals(w2) ? true : false);
   }
   
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
