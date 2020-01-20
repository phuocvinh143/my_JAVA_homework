package session1;

import java.util.*;

class Bai4 {
	public static int Input() {
		String inp = ""; int n = 0;
		Scanner sc = new Scanner(System.in);
		do {
			inp = sc.nextLine();
			try {
				n = Integer.parseInt(inp);
			}
			catch (Exception e) {
				n = Integer.MAX_VALUE;
				System.out.println("Please enter a NUMBER!!!");
			}
		} while (n == Integer.MAX_VALUE);
		return n;
	}
	public static void main(String[] args) {
		Bai4 solver = new Bai4();
		int a = solver.Input();
		int b = solver.Input();
		System.out.println("A + B = " + (a + b));
	}
}
