package beginnersSelection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ABC085B_Kagami_Mochi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int inputNum = sc.nextInt();

		Integer[] values = new Integer[inputNum];

		for (int i = 0; i < inputNum; i++) {
			values[i]  = sc.nextInt();
		}

		Arrays.sort(values, Collections.reverseOrder());


		int count = 0;
		for (int i = 0; i < inputNum; i++) {

			if (i == 0) {
				count++;
				continue;
			}

			if (values[i] == values[i - 1]) {
				continue;
			} else {
				count++;
			}
		}


		System.out.println(count);



	}

}
