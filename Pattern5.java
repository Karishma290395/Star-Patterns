package test5;

public class Pattern5 {

	public static void main(String[] args) {
	for (int i=1; i<6; i++){
		int temp=i;
		while(temp>0) {
			if((i ==3 && temp==2) || (i== 4 && (temp ==3 || temp==2))) {
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
			temp--;
			}
		System.out.println(""); 
		}
	}
}