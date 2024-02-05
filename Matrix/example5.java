package Matrix;

import java.util.Scanner;

public class example5 {
	public static void main(String[] args) {
       String input1="mari to zzo";
    	String input2="1321";
       String[] newStr=input1.split(" ");
       String output="";
       for(int i=1;i<=input2.length();i++) {
    	   Character ch=input2.charAt(i-1);
    	   output +=newStr[Character.getNumericValue(ch)-1];
    	   
       }

       System.out.println(output);
    }
}

