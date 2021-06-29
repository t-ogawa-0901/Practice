package jp.co.aforce.test;

public class PracticeTest2 {

	public static void main(String[] args) {
		int x = 10;
		int y = 28;
		double z = 3.14;
		
		//1
		System.out.println(x);
		System.out.println(y);
		
		//2
		System.out.println(y / x + "," + y % x);
		
		//3
		double yz = y * z;
		System.out.println(yz);
		
		//4
		System.out.println(++yz);
		
		
		//5
		int age = 22;
		int r = new java.util.Random().nextInt(101);
		if(age > r) {
			System.out.println("私の方が年上です");
		}
		else if(age < r) {
			System.out.println("私の方が年下です");
		}
		else {
			System.out.println("私と同い年です");
		}
		System.out.println(r);
	}

}
