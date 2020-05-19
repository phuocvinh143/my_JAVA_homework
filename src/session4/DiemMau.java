package session4;

import session2.Diem;

import java.util.Scanner;

public class DiemMau extends Diem {
    private String mau;
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
}
