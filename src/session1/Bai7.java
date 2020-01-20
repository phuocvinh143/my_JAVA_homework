package session1;

import java.util.*;

public class Bai7 {
	public String parse_name(String fname) {
		String fname_s = fname.trim();
		return fname_s.substring(fname_s.lastIndexOf(" ") + 1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your full name!");
		String s = sc.nextLine();
		Bai7 solver = new Bai7();
		System.out.println("His/Her name is: " + solver.parse_name(s));
	}

}
