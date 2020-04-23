package session3;

import session2.Diem;

public class DoanThang {
    private Diem d1, d2;
    public DoanThang() {
        d1 = new Diem();
        d2 = new Diem();
    }
    public DoanThang(Diem x,Diem y) {
        d1 = new Diem(x);
        d2 = new Diem(y);
    }
    public DoanThang(int ax,int ay, int bx, int by ) {
        d1 = new Diem(ax, ay);
        d2 = new Diem(bx, by);
    }
    public void nhapDoanThang() {
        System.out.println("Nhap gia tri hai dau mut doan thang: ");
        d1.nhapDiem();
        d2.nhapDiem();
    }
    public void hienThi() {
        System.out.println("Gia tri hai dau mut doan thang la: ");
        d1.hienThi();
        d2.hienThi();
    }
    public void doiDiem(int dx, int dy) {
        d1.doiDiem(dx, dy);
        d2.doiDiem(dx, dy);
    }
    public boolean trungNhau(DoanThang d3) {
        return (d1.trungNhau(d3.d1) && d2.trungNhau(d3.d2));
    }
    public double doDai() {
        return d1.khoangCach(d2);
    }
}
