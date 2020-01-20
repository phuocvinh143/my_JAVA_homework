package session1;

import java.util.*;

public class Bai6 {
	public boolean is_Prime(int x) {
		if (x < 2) return false;
		if (x == 2) return true;
		for (int i = 2; i*i <= x; ++i) {
			if (x % i == 0) return false;
		}
		return true;
	}
	public String dec2bin(int x) {
		String ans = "";
		int tmp = x;
		while (tmp != 0) {
			ans = ((tmp%2) + "") + ans;
			tmp /= 2;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		Bai6 solver = new Bai6();
		if (solver.is_Prime(x)) {
			System.out.println("This is a prime number!");
		}
		else {
			System.out.println("This is not a prime number!");
		}
		System.out.println(solver.dec2bin(x));
	}

}
