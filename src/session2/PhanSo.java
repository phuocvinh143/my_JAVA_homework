package session2;

import java.util.Scanner;

public class PhanSo {
    private int tu, mau;
    public PhanSo() {
        tu = mau = 0;
    }
    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public int nhapSo() {
        int n = 0; String s; boolean error = false;
        Scanner sc = new Scanner(System.in);
        do {
            s = sc.next();
            try {
                n = Integer.parseInt(s);
            }
            catch (NumberFormatException e) {
                System.out.print("Nhap lai mot so nguyen: ");
                sc.nextLine();
                error = true;
            }

        } while(error);
        return n;
    }
    public void nhapPS() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tu so = ");
        tu = nhapSo();
        do {
            System.out.print("Mau so = ");
            mau = nhapSo();
        } while (mau == 0);
    }
    public void in() {
        if (tu == 0) System.out.print("0");
        else if (mau == 1) System.out.print(tu);
        else if (tu < 0 && mau < 0) System.out.print(-tu + "/" + -mau);
        else if (tu > 0 && mau < 0) System.out.print(-tu + "/" + mau);
        else if (tu % mau == 0)  System.out.print(tu/mau);
        else System.out.print(tu + "/" + mau);
        System.out.print("\n");
    }
    public void nghichDao() {
        int tmp = tu;
        tu = mau;
        mau = tmp;
    }
    public PhanSo giaTriNghichDao() {
        PhanSo tmp = new PhanSo(mau, tu);
        return tmp;
    }
    public double giaTriPhanSo() {
        return tu/mau;
    }
    public boolean lonHon(PhanSo a) {
        return tu*a.mau > a.tu*mau;
    }
    public PhanSo cong(PhanSo a) {
        PhanSo tmp = new PhanSo(tu*a.mau + a.tu*mau, a.mau*mau);
        return tmp;
    }
    public PhanSo tru(PhanSo a) {
        PhanSo tmp = new PhanSo(tu*a.mau - a.tu*mau, a.mau*mau);
        return tmp;
    }
    public PhanSo nhan(PhanSo a) {
        PhanSo tmp = new PhanSo(tu*a.tu, mau*a.mau);
        return tmp;
    }
    public PhanSo chia(PhanSo a) {
        return this.nhan(a.giaTriNghichDao());
    }
    public void gan(PhanSo a) {
        tu = a.tu;
        mau = a.mau;
    }
}
