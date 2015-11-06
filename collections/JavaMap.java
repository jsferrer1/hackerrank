package collections;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class JavaMap {
	
 public static void main(String []argh)
 {
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    in.nextLine();
    
    HashMap<String, String> contact = new HashMap<>();
    
    for(int i=0;i<n;i++)
    {
       String name=in.nextLine();
       int phone=in.nextInt();
       in.nextLine();
       contact.put(name, String.valueOf(phone));
    }
    
    while(in.hasNext())
    {
        String s=in.nextLine();
		try {
	        if (!contact.get(s).isEmpty()) {
				System.out.format("%s=%s\n", s, contact.get(s));
	        }
		} catch (Exception e) {
			System.out.println("Not found");
		}
	}
    
 }
}
