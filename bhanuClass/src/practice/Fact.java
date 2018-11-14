package practice;

public class Fact {
	//factorial
	public static void main(String[] args) {
	facto(5);
	System.out.println(factoRec(5));
	}
    
	//a method to obtain n factorial
    static void facto(int n) {
	int fact=1;
	
	for(int i=1;i<=n;i++) {
		fact=fact*i;
	}
	System.out.println(fact);
    }
    
    // recursive logic
    static int factoRec(int n) {
    	if(n==1) {
    		return 1;
    	}
    	return n*factoRec(n-1);
    }
    
}