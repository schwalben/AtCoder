package beginnersSelection;

import java.util.Scanner;

public class ABC081B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int num = sc.nextInt();

		int[] inputs = new int[num];

		for (int i = 0; i < num; i++) {
			inputs[i]  = sc.nextInt();

		}


		int count = 0;

		while (true) {

			boolean hasOdd = false;
			for (int input : inputs) {
				if (input % 2 == 1) {
					hasOdd = true;
				}
			}

			if (hasOdd) {
				System.out.println(count);
				break;
			}

			for (int i = 0; i < inputs.length; i++) {
				inputs[i] = inputs[i] / 2;
			}
			count++;
		}

	}

}
