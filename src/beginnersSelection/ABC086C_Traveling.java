package beginnersSelection;

import java.util.Scanner;

public class ABC086C_Traveling {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int inputNum = sc.nextInt();

		int[] t = new int[inputNum];
		int[] x = new int[inputNum];
		int[] y = new int[inputNum];


		for (int i = 0; i < inputNum; i++) {

			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}


		for (int i = 0; i < inputNum; i++) {

			int xDiff = i == 0 ?  x[i] : x[i] - x[i - 1];
			int yDiff = i == 0 ?  y[i] : y[i] - y[i - 1];
			int tDiff = i == 0 ?  t[i] : t[i] - t[i - 1];

			int tAndCoordinateDiff = xDiff + yDiff - tDiff;

			if (tAndCoordinateDiff > 0) {
				System.out.println("No");
				return;
			} else if (Math.abs(tAndCoordinateDiff) % 2 == 1) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
	}

}
