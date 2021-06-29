package jp.co.aforce.test;

import java.util.ArrayList;

public class PracticeTest3 {

	public static void main(String[] args) {
		//1
		String[] tanaka = {"1","田中太郎","男性","27"};
		System.out.println(tanaka[1]);
		
		//4
		String[] satou = {"2","佐藤花子","女性","22"};
		String[] suzuki = {"3","鈴木次郎","男性","31"};
		
		
		//5
		ArrayList<String>scores = new ArrayList<>();
		scores.add("国語");
		scores.add("90点");
		scores.add("数学");
		scores.add("80点");
		scores.add("英語");
		scores.add("65点");
		for(String score : scores) {
			System.out.println(score);
		}
		
		//6
		
	}

}
