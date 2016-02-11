import java.util.Scanner;
public class Skocimis {
	public static void main(String[] args) {
		int n[] = new int[3];
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("Input 3 integer (0 < A < B < C < 100): ");
			for (int i = 0; i < n.length; i++) {
			n[i] = scan.nextInt();
			}
			if (n[0] <= 0 || n[0] >= 100) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (n[1] <= 0 || n[1] >= 100) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (n[2] <= 0 || n[2] >= 100) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (n[1] <= n[0]) {
				System.out.println("B must more than A. Please enter again!!!");
			} else if (n[2] <= n[1]) {
				System.out.println("C must more than B. Please enter again!!!");
			}
		} while (n[0] <= 0 || n[0] >= 100 || n[1] <= 0 || n[1] >= 100 || n[2] <= 0 || n[2] >= 100 || n[2] < n[0] || n[2] < n[1] || n[1] < n[0] || n[0] > n[1] || n[0] > n[2]);
		System.out.println("------- Output -------- ");
		System.out.println(" Most played : " + ((n[2] - n[1]) - 1) + " time.");
	}
}