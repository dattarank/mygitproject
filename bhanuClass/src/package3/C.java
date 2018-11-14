package package3;

class A {
	String s;
	void testA() {
		System.out.println(s);
	}
	A(){
		B.testB(this);
	}
	
}
class B {
	static void testB(A a1) {
		a1.s="qsp";
	}
	
}

public class C {

	public static void main(String[] args) {
		A a1=new A();
		//B.testB(a1);
		a1.testA();

	}

}
