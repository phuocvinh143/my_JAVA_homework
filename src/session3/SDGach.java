package session3;

import java.util.Scanner;

public class SDGach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt(), ans;
        double cpl = 100000000;
        Gach arr[] = new Gach[n + 7];
        for (int i = 1; i <= n; ++i) {
            arr[i] = new Gach();
            arr[i].NhapThongTinh();
            arr[i].InThongTinh();
            if (arr[i].GiaBanLe()/arr[i].DienTich() < cpl) {
                ans = i;
                cpl = arr[i].GiaBanLe()/arr[i].DienTich();
            }
        }
    }
}
