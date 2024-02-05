package Matrix;

import java.util.Scanner;

public class example2 {
	public static void main(String[] args) {
	int [] input= {3,1,5,2,1};
	int friend=input[0];
	int enemy=0;
	for(int i=1;i<input.length;i++) {
		if(friend>=input[i]) {
			friend=input[i];
			enemy=i;
		}
		else {
			continue;
			
		}
	  }
	  System.out.println("Friend: "+friend+" "+"Enemy: "+enemy);
	 }
	}