package jp.co.aforce.test;

public class PracticeTest1 {

	public static void main(String[] args) {
		//1
		final double TAX = 0.1;
		System.out.println(TAX);
		
		//2
		int x = 480;
		double price = x + x * TAX;
		System.out.println("この商品の値段は" + (int)price + "円です");
		
		//3
		String name = "小川貴史";
		System.out.println(name);
	}

}
