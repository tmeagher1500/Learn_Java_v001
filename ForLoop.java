package loops;

public class ForLoop {

	public static void main(String[] args) {
		//increment by 1
		System.out.println("===== increment by 1 =====");
		for (int i = 0; i < 5; i++) {
			System.out.print(i+" ");
			//output: 0 1 2 3 4
		}

		System.out.println("\n===== increment by 2 =====");
		for (int i = 0; i <= 5; i=i+2) {
			System.out.print(i+" ");
			//output: 0 2 4
		}
	}

}
