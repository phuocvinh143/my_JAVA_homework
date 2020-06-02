package session4;

import session2.Diem;

import java.util.Scanner;

public class DiemMau extends Diem {
    private String mau;
    public DiemMau() {
        super();
        mau = new String();
    }
    public DiemMau(int x, int y, String mau) {
        super(x, y);
        this.mau = mau;
    }
    public void ganMau(String mau) {
        this.mau = mau;
    }
    public void nhapDiem() {
        super.nhapDiem();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mau: ");
        mau = sc.nextLine();
    }
    public void hienThi() {
        System.out.println("(" + this.giaTriX() + ", " + this.giaTriY() + ")");
        System.out.println("mau: " + this.mau);
    }
}
