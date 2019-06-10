package beginnersSelection;

import java.util.Scanner;

public class ABC087B_Coins {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num500 = sc.nextInt();
		int num100 = sc.nextInt();
		int num50 = sc.nextInt();

		int goalSum = sc.nextInt();

		int matchCount = 0;

        for (int index500 = 0; index500 <= num500; index500++) {
        	for (int index100 = 0; index100 <= num100; index100++) {
        		for (int index50 = 0; index50 <= num50; index50++) {
        			int sum = 500 * index500 + 100 * index100 + 50 * index50;
        			if (goalSum == sum) {
        				matchCount++;
        			}

        		}
        	}
        }
        System.out.println(matchCount);
	}
}
