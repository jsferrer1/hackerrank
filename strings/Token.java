package strings;

import java.io.*;
import java.util.*;

public class Token {

  
    public static void main(String[] args) 
    {

      // He is a very very good boy, isn't he?
      Scanner scan = new Scanner(System.in);
      String s=scan.nextLine();
      //Complete the code
      StringTokenizer st = new StringTokenizer(s, " !,?._'@");
      System.out.println(st.countTokens());
      while (st.hasMoreElements()) {
    	  System.out.println(st.nextElement());  
      }
      
    }
}
