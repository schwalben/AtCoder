package beginnersSelection;

import java.util.Scanner;

public class ABC049C_Daydream {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		String replaced = s.replaceAll("eraser", " ").replaceAll("erase", " ").replaceAll("dreamer", " ").replaceAll("dream", " ");

		if (replaced.replaceAll(" ", "").length() == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
