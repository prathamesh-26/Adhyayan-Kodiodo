package Program_2;

public class Factors {

	public static void main(String[] args) {
		// print factors of number but not include 1 and itself number test case is 28,13.

		int num = 13;
		boolean flag = false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("None");
		}
	}

}
