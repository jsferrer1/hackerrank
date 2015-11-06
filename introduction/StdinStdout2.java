package introduction;

import java.util.Scanner;

public class StdinStdout2 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String output = "================================\n";
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                output += String.format("%-15s%03d\n", s1, x);
            }
            output += "================================";
            System.out.println(output);

    }
}
