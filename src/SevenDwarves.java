import java.util.Scanner;

public class SevenDwarves {

public static void main (String[]args){
	Scanner scan = new Scanner (System.in);
	int A1, A2, A3, A4, A5, A6, A7, A8, A9;
	
	System.out.println("Input 9 Number of Dwarves 1-99 : ");
	A1 = scan.nextInt();
	A2 = scan.nextInt();
	A3 = scan.nextInt();
	A4 = scan.nextInt();
	A5 = scan.nextInt();
	A6 = scan.nextInt();
	A7 = scan.nextInt();
	A8 = scan.nextInt();
	A9 = scan.nextInt();
	scan.close();
	
	if (100 == A1 + A2 + A3 + A4 + A5 + A6 + A7)
	System.out.println(A1 + "\n" + A2 +"\n" + A3+"\n" + A4 + "\n" + A5 + "\n" + A6 + "\n" + A7);
	else if (100 == A8 + A2 + A3 + A4 + A5 + A6 +A7 +A8 )
		System.out.println(A2+"\n"+A3+"\n"+A4+"\n"+A5+"\n"+A6+"\n"+A7+"\n"+A8);
	else if (100 == A9 + A2 + A3 + A4 + A5 + A6 + A7)
		System.out.println(A2 + "\n" + A3 + "\n" + A4 + "\n" + A5 + "\n" + A6 + "\n" + A7 + "\n" + A9);
	else if (100 == A1 + A8 + A3 + A4 + A5 + A6 + A7)
		System.out.println( A1 + "\n" + A3 + "\n" + A4+ "\n" + A5+ "\n" + A6 + "\n" + A7 + "\n" + A8);
	else if (100 == A1 + A9 + A3 + A4 + A5 + A6 + A7)
		System.out.println(A1 + "\n" + A3 + "\n" + A4 + "\n" + A5 + "\n" + A6 + "\n" + A7 + "\n" + A9);
	else if (100 == A1 + A2 + A8 + A4 + A5 + A6 + A7)
		System.out.println(A1 + "\n" + A2 + "\n" + A4 + "\n" + A5+ "\n" + A6 + "\n" + A7 + "\n" + A8);
	else if (100 == A1+ A2 + A9 + A4 + A5 + A6 + A7)
		System.out.println(A1 + "\n" + A2 + "\n" + A4 + "\n" + A5+ "\n" + A6 + "\n" + A7 + "\n" + A9);
	else if (100 == A1 + A2 + A3 + A8 + A5 + A6 + A7)
		System.out.println(A1 + "\n" + A2 + "\n" + A3 + "\n" + A5 + "\n" + A6 + "\n" + A7 + "\n" + A8);
	else if (100 == A1+ A2+ A3 + A9 + A5 + A6 + A7)
		System.out.println(A1 + "\n" + A2 + "\n" + A3 + "\n" + A5 + "\n" + A6 + "\n" + A7 + "\n" + A9);
	else if (100 == A1 + A2 + A3 + A4 + A8 + A6 + A7)
		System.out.println(A1 + "\n" + A2 + "\n" + A3 + "\n" + A4 + "\n" + A6 +" \n" + A7 + "\n" + A8);
	else if (100 == A1 + A2 + A3 + A4 + A9 + A6 + A7)
		System.out.println(A1 + "\n" + A2 + "\n" + A3 + "\n" + A4+ "\n" + A6 + "\n" + A7 + "\n" + A9);
	else if (100 == A1 + A2 + A3 + A4+ A5 + A8 + A7)
		System.out.println(A1 + "\n" + A2 + "\n" + A3 + "\n" + A4 + "\n" + A5 + "\n" + A7 + "\n" + A8);
	else if (100 == A1 + A2 + A3 + A4 + A5 + A9 + A7)
		System.out.println(A1 + "\n" + A2 + "\n" + A3 + "\n" + A4 + "\n" + A5 + "\n" + A7 + "\n" + A9);
	else if (100 == A1 + A2 + A3 + A4 + A5 + A6 + A8)
		System.out.println(A1 + "\n" + A2 + "\n" + A3 + "\n" + A4 + "\n" + A5 + "\n" + A6 + "\n" + A8);
	else if (100 == A1 + A2 + A3 + A4 + A5 + A6 + A9)
		System.out.println(A1 + "\n" + A2 + "\n" + A3 + "\n" + A4 + "\n" + A5 + "\n" + A6 + "\n" + A9);
	else if (100 == A8 + A9 + A3 + A4 + A5 + A6 + A7)
		System.out.println(A3 + "\n" + A4 + "\n" + A5 + "\n" + A6 + "\n" + A7 + "\n" + A8 + "\n" + A9);
	else if (100 == A1 + A8 + A9 + A4 + A5 + A6 + A7)
		System.out.println(A1 + "\n" + A4 + "\n" + A5 + "\n" + A6 + "\n" + A7 + "\n" + A8 + "\n" + A9);
	else if (100 == A1+ A2 + A8 + A9 + A5 + A6 + A7)
		System.out.println(A1 + "\n" + A2 + "\n" + A5 + "\n" + A6 + "\n" + A7 + "\n" + A8 + "\n" + A9);
	else if (100 == A1 + A2 + A3 + A8 + A9 + A6 + A7)
		System.out.println(A1 + "\n" + A2 + "\n" + A3 + "\n" + A6 + "\n" + A7 + "\n" + A8 + "\n" + A9);
	else if (100 == A1 + A2 + A3 + A4 + A8 + A9 + A7)
		System.out.println(A1 + "\n" + A2 + "\n" + A3 + "\n" + A4 + "\n" + A7 + "\n" + A8 + "\n" + A9);
	else if (100 == A1 + A2 + A3 + A4 + A5 + A8 + A9)
		System.out.println(A1 + "\n" + A2 + "\n" + A3 + "\n" + A4 + "\n" + A5 + "\n" + A8 + "\n" + A9);
	else if (100 == A9 + A2 + A3 + A4 + A5 + A6 + A8)
		System.out.println(A2 + "\n" + A3 + "\n" + A4 + "\n" + A5 + "\n" + A6 + "\n" + A8 + "\n" + A9);
	else System.out.println("Number more than 100 or Number less than 100" );
	}
}