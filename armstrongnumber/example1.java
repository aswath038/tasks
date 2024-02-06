package armstrongnumber;

public class example1 {

	public static void main(String[] args) {
		int temp, digits=0, sum=0,last=0;
		temp=371;
		while(temp>0) {
			temp=temp/10;
			digits++;
			}
			temp=371;
			int n=371;                                      
			while(temp>0) {
				last=temp%10;                           //itr 1: last=1,  sum=1, temp=37;          
				sum+=Math.pow(last, digits);            //itr 2: last=7,  sum=344, temp=3;
				temp=temp/10;                           //itr 3: last=3,  sum=371, temp=0;
			}
        if(n==sum) {
        	System.out.println(n + " is an arm strong number");
        }
        else
        	System.out.println(n + "is not an arm strong number");
	}

}
