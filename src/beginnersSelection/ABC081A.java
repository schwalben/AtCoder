package beginnersSelection;

import java.util.Scanner;

public class ABC081A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String s = sc.next();

		String[] inputs = s.split("");

		int count = 0;
		for (String input : inputs ) {
			if (input.equals("1")) count++;
		}

		System.out.println(count);

	}

}
