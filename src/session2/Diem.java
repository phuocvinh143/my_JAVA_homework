package session2;

import java.util.*;

public class Diem {
    private int x, y;
    public Diem() {
        this.x = 0;
        this.y = 0;
    }
    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Diem(Diem d) {
        this.x = d.x;
        this.y = d.y;
    }
    public void nhapDiem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x = ");
        x = sc.nextInt();
        System.out.print("Nhap y = ");
        y = sc.nextInt();
    }
    public boolean trungNhau(Diem a) {
        return (x == a.x && y == a.y);
    }
    public void hienThi() {
        System.out.printf("(%d,%d)\n", x, y);
    }
    public void doiDiem(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    public int giaTriX() {
        return x;
    }
    public int giaTriY() {
        return y;
    }
    public double khoangCach() {
        return (Math.sqrt(this.x*this.x + this.y*this.y));
    }
    public double khoangCach(Diem d) {
        double a1 = (d.x - this.x)*(d.x - this.x);
        double a2 = (d.y - this.y)*(d.y - this.y);
        return (Math.sqrt(Math.pow(d.x - this.x, 2) + Math.pow(d.y - this.y, 2)));
    }
}
