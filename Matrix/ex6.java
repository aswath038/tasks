package Matrix;

import java.util.Scanner;

public class ex6 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String a = sc.nextLine();
	        String b = sc.nextLine();
	        String c = sc.nextLine();
	        String t = sc.nextLine();

	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < t.length(); i++) {
	            char curr = t.charAt(i);
	            if (curr == '1') {
	                result.append(a);
	            } else if (curr == '2') {
	                result.append(b);
	            } else if (curr == '3') {
	                result.append(c);
	            }
	        }
	        System.out.println(result);
	    }
	}

