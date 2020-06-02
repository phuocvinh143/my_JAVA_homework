package session4;

import java.util.Scanner;

public class SDConVat {
    public static void main(String[] args) {
        System.out.print("Nhap so con vat: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ConVat[] ds = new ConVat[n+5];
        for (int i = 1; i <= n; ++i) {
            System.out.print("Ban muon nhap con gi? (1: Heo, 2: Bo, 3: De, 4: Ga): ");
            int x = sc.nextInt();
            if (x == 1) ds[i] = new Heo();
            if (x == 2) ds[i] = new Bo();
            if (x == 3) ds[i] = new De();
            if (x == 4) ds[i] = new Ga();
            ds[i].nhap();
        }
        for (int i = 1; i <= n; ++i) {
            ds[i].Keu();
        }
    }
}
