package session4;

import session3.SinhVien;

import java.util.Scanner;

public class SDSinhVienCNTT {
    public static void main(String[] args) {
        System.out.print("Nhap so sinh vien: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SinhVienCNTT ds[] = new SinhVienCNTT[n+5];
        for (int i = 1; i <= n; ++i) {
            System.out.println("Nhap sinh vien thu " + i);
            ds[i] = new SinhVienCNTT();
            ds[i].nhapDiem();
        }
        for (int i = 1; i <= n; ++i) ds[i].hienThi();
    }
}
