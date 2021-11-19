package test5;

public class pattern1 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < 3; i++) {
			int temp = i;
			while (temp > 0) {
				System.out.print(" ");
				temp--;
			}
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}

			System.out.println("");
			n = n - 2;

		}
	}

}