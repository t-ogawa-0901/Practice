package jp.co.aforce.test;

import java.util.ArrayList;

public class PracticeTest4 {

	public static void main(String[] args) {
		//1
		//"=="はプリミティブ型で比較し、"equals"は参照型で比較するので、
		//このサンプルこコードは文字列なので"equals"を使う方がよいと思う。
		
		//2
		ArrayList<String> animals = new ArrayList<>();
		animals.add("犬");
		animals.add("猫");
		animals.add("うさぎ");
		animals.add("へび");
		
		//3
		String bard = "鳥";
		if(animals.contains(bard)) {
			System.out.println(bard + "はリストに含まれています");
		}
		else {
			System.out.println(bard + "はリストに含まれていません");
		}
		
		//4
		String Jan = "元日,成人の日";
		String Feb = "建国記念の日,天皇誕生日";
		String Mar = "春分の日";
		String Apr = "昭和の日";
		String May = "憲法記念日,みどりの日,こどもの日";
		String Jun = "なし";
		String Jul = "海の日,スポーツの日";
		String Aug = "山の日";
		String Sep = "敬老の日,秋分の日";
		String Oct = "なし";
		String Nov = "文化の日,勤労感謝の日";
		String Dec = "なし";
		int birthday = 9;
		switch(birthday) {
		case 1:
			System.out.println(Jan);
			break;
		case 2:
			System.out.println(Feb);
			break;
		case 3:
			System.out.println(Mar);
			break;
		case 4:
			System.out.println(Apr);
			break;
		case 5:
			System.out.println(May);
			break;
		case 7:
			System.out.println(Jul);
			break;
		case 8:
			System.out.println(Aug);
			break;
		case 9:
			System.out.println(Sep);
			break;
		case 11:
			System.out.println(Nov);
			break;
		case 6:
		case 10:
		case 12:
			System.out.println(Jun);
			break;
		}
		//祝日なしが３つあったのでまとめることができるなと思ったから。
	}

}
