package test5;

public class Pattern4 {

	public static void main(String[] args) {

		for (int i = 4; i >= 0; i--){
			int n=i;
			 while(n>=0)
			 {
				 System.out.print(" ");
				 n--;
			}
			for (int j = 4; j >=0; j--){
				System.out.print("*");
				 }
			System.out.println("");
		}
	}
}

