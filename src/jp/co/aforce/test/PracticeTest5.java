package jp.co.aforce.test;

public class PracticeTest5 {

	public static void main(String[] args) {
		//1
		int fortune = new java.util.Random().nextInt(4) + 1;
		System.out.println(fortune);
		switch(fortune) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		default:
			System.out.println("凶です");
			break;
		}
		
		//2
		int total = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 7 == 0) {
				System.out.println(i);
				total += i;
			}
		}
		System.out.println("7の倍数の総合計は" + total);
		
		//3
		for ( int i = 1; i <= 9; i ++ ) {
			for ( int j = 1; j <= 9; j ++ ) {
				System.out.print( " " + i * j );
			}
			System.out.println();
		}
	}

}
