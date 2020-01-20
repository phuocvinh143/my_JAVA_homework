package session1;

import java.util.*;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0.0, MAX = -Double.MAX_VALUE;
		for (String x : args) {
			double n = 0.0;
			try {
				n = Double.parseDouble(x);
			} catch (Exception e) {
				n = 0.0;
			}
			sum += n;
			MAX = Math.max(n, MAX);
		}
		System.out.println("MAX = " + MAX + "\n" + "SUM = " + sum);
	}

}
