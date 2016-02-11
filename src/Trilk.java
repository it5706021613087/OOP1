import java.util.Scanner;
public class Trilk {

	public static void main(String[] args) {
		int i, p = 1;
		char abc[] = new char[100];
		Scanner scan = new Scanner(System.in);
		System.out.print("Input data : ");
		abc=scan.next().toCharArray();
		
		for (int j = 0 ; j < abc.length ; j++) {
			if (abc[j]=='A') {
				if (p==1) { p=2; }
				else if (p==2) { p=1;}
			}
			else if (abc[j]=='B') {
				if (p==2) { p=3; }
				else if (p==3) { p=2;}
			}
			else if (abc[j]=='C') {
				if (p==3) { p=1; }
				else if (p==1) { p=3;}
			}
		}
		System.out.print(p);
	}
}