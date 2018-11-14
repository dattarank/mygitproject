package practice;

public class FactAdd {
//Factorail Add
	public static void main(String[] args) {
		
	int dsum=0;
	int num=145;
	int temp=num;
	while(num>0) {
		int d=num%10;
		dsum=dsum+fact(d);
		num=num/10;
	    }
	System.out.println(dsum);
	if(temp==dsum) {
		System.out.println("Strong Number");
	}
    }
	static int fact(int n) {
    	if(n==1|| n==0) {
    		return 1;
    	}
    	return n*fact(n-1);
    }

}
