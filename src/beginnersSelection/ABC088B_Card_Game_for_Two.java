package beginnersSelection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ABC088B_Card_Game_for_Two {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int cardNum = sc.nextInt();

		Integer[] cardValues = new Integer[cardNum];

		for (int i = 0; i < cardNum; i++) {
			cardValues[i]  = sc.nextInt();
		}

		Arrays.sort(cardValues, Collections.reverseOrder());


		int alicePoint = 0;
		int bobPoint = 0;
		int index = 1;
		for (int cardValue : cardValues) {
			if (index % 2 == 1) {
				alicePoint+= cardValue;
			} else {
				bobPoint+= cardValue;
			}
			index++;
		}

		System.out.println(alicePoint - bobPoint);
	}

}
