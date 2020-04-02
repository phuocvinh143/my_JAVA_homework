package session2;

import java.util.*;

public class Date {
    private int ngay, thang, nam;
    public Date() {
        this.ngay = this.thang = this.nam = 0;
    }
    public Date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    public boolean hopLe() {
        int d = this.ngay, m = this.thang, y = this.nam;
        int max[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((y % 400 == 0 || (y % 100 != 0 && y % 4 == 0))) max[2] = 29;
        if (d > 0 && m > 0 && m < 13 && y > 0 && d <= max[m]) return true;
        return false;
    }
    public int nhapSo() {
        int n = 0; String s; boolean error = false;
        Scanner sc = new Scanner(System.in);
        do {
            s = sc.next();
            try {
                n = Integer.parseInt(s);
                error = false;
                if (n < 0) {
                    System.out.print("Nhap lai mot so nguyen duong: ");
                    error = true;
                }
            }
            catch (NumberFormatException e) {
                System.out.print("Nhap lai mot so nguyen: ");
                sc.nextLine();
                error = true;
            }

        } while(error);
        return n;
    }
    public void nhapNgayThangNam() {
        System.out.print("Nhap ngay: ");
        ngay = nhapSo();
        System.out.print("Nhap thang: ");
        thang = nhapSo();
        System.out.print("Nhap nam: ");
        nam = nhapSo();
    }
    public Date ngayHomSau() {
        Date a = new Date(ngay, thang, nam);
        int d = this.ngay, m = this.thang, y = this.nam;
        int max[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((y % 400 == 0 || (y % 100 != 0 && y % 4 == 0))) max[2] = 29;
        ++a.ngay;
        if (a.ngay > max[a.thang]) {
            a.ngay = 1;
            ++a.thang;
            if (a.thang > 12) {
                a.thang = 1;
                ++a.nam;
            }
        }
        return a;
    }
    public Date congNgay(int n) {
        Date a = new Date(ngay, thang, nam);
        for (int i = 1; i <= n; ++i) a = a.ngayHomSau();
        return a;
    }
    public void in() {
        System.out.printf("%d/%d/%d\n", ngay, thang, nam);
    }
}
