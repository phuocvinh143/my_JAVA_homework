package session1;

import java.util.*;

public class Bai8 {
	
	public int count_number(int a[], int x, int n) {
		int cnt = 0;
		for (int i = 0; i < n; ++i) {
			if (a[i] == x) ++cnt;
		}
		return cnt;
	}
	
	public void sort_func(int a[], int n) {
		for (int i = 0; i < n-1; ++i) {
			for (int j = i + 1; j < n; ++j) {
				if (a[i] > a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		for (int i = 0; i < n; ++i) System.out.print(a[i] + " ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 2 3 4 5 5 5 5 2
		Scanner sc = new Scanner(System.in);
		Bai8 solver = new Bai8();
		int i = 0;
		int a[] = new int[100007];
		System.out.print("The init list is: ");
		for (String x : args) {
			System.out.print(x + " ");
			a[i++] = Integer.parseInt(x);
		}
		System.out.print("\nEnter a integer for counting: ");
		int x = sc.nextInt();
		System.out.println("The number has appeared " + solver.count_number(a, x, i) + " time(s)!");
		System.out.print("The sorted array: ");
		solver.sort_func(a, i);
	}

}
