package session1;

import java.util.*;

public class Bai5 {
	
	public void ptb1(double a, double b) {
		System.out.println(a + "x" + "+" + b + "= 0\n" + "=> x = " + (-b/a));
	}
	
	public void ptb2(double a, double b, double c) {
		double delta = b*b - 4*a*c;
		if (delta < 0) {
			System.out.println("No solution!");
		}
		else if (delta == 0) {
			System.out.println("x1 = x2 = " + (-b/2*a));
		}
		else {
			double x1 = (-b + Math.sqrt(delta))/(2*a);
			double x2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Bai5 solver = new Bai5();
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		if (a == 0) {
			solver.ptb1(b, c);
		}
		else {
			solver.ptb2(a, b, c);
		}
	}

}
