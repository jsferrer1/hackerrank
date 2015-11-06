package collections;

import java.util.*;

class Stack {
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
    	  String input=sc.next();
          //Complete the code
    	  /*
			{}()
			({()})
			{}(
			[]    	   
    	   */
    	  
    	  //System.out.println("initialize...");
    	  HashMap<String, Integer> h = new HashMap<String, Integer>();
    	  h.put("{", 0);
    	  h.put("}", 0);
    	  h.put("(", 0);
    	  h.put(")", 0);
    	  h.put("[", 0);
    	  h.put("]", 0);
    	  
    	  //System.out.println("input=" + input);
    	  //System.out.println("input(0)=" + input.charAt(0));
    	  //System.out.println("{=" + h.get("{"));
    	  for (int i=0; i<input.length(); i++) {
      		String key = "" + input.charAt(i);
    		int cnt = h.get(key).intValue() + 1;
    		h.put(key, cnt);  
    	  }
    	  
    	  //System.out.println("check...");
    	  if (h.get("{").intValue() == h.get("}").intValue() &&
    		  h.get("(").intValue() == h.get(")").intValue() &&
    		  h.get("[").intValue() == h.get("]").intValue() ) {
    		  System.out.println("true");
    	  } else {
    		  System.out.println("false");
    	  }
      }
      
   }
}