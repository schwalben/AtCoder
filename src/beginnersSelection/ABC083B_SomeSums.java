package beginnersSelection;

import java.util.Scanner;
import java.util.stream.Stream;

public class ABC083B_SomeSums {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int min = sc.nextInt();
		int max = sc.nextInt();


		int sum = 0;

		for (int i = 1; i <= N; i++) {
			String[] numsStr =  Integer.toString(i).split("");
			int digitssum = Stream.of(numsStr).mapToInt(Integer::parseInt).sum();

			if (digitssum >= min && digitssum <= max) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
