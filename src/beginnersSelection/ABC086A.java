package beginnersSelection;

import java.util.Scanner;

public class ABC086A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();

		System.out.println(a * b % 2 == 0 ? "Even" : "Odd");


	}

}
