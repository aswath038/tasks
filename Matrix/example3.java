package Matrix;

import java.util.Scanner;

public class example3 {
	 public static void main(String[] args) {
	     int[][] input= {{10,12,13},{14,15,16},{17,18,19}};
	     int res=0;
	     for(int i=0;i<input.length;i++) {
	    	 for(int j=i;j<input[0].length;j++) {
	    		 res+=input[i][j];
	    	}
	     }
	     System.out.println("Upper Matrix: "+res);
	      res=0;
	     for(int i=0;i<input.length;i++) {
	    	 for(int j=i;j<input[0].length;j++) {
	    		 res+=input[j][i];
	    	}
	     }
	     System.out.println("Lower Matrix: "+res);
	 }
	}
        
