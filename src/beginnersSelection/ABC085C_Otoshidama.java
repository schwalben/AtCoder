package beginnersSelection;

import java.util.Scanner;

public class ABC085C_Otoshidama {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int amount =  sc.nextInt();

		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num - i; j++) {
				int sum = 10000 * i + 5000 * j + 1000 * (num - j - i);
				if (amount == sum) {
					System.out.println(i + " " + j + " " + (num - j - i));
					return;
				}
			}

		}
		System.out.println("-1 -1 -1");
	}
}
