package test0112;

public class Test02 {
	static int x = 300;
	static void prn() {
		System.out.println("prn");
	}
	public static void main(String[] args) {
		
		int y = Test02.x	;
		System.out.println(x);
		prn();
		Test02.prn();
	}
	
	//추상클래스와 인터페이스의 차이
}
