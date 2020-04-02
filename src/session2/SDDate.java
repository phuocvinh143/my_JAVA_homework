package session2;

public class SDDate {
    public static void main(String[] args) {
        Date a = new Date();
        a.nhapNgayThangNam();
        if (a.hopLe()) {
            a.in();
            a.ngayHomSau().in();
            a.congNgay(2).in();
        } else {
            System.out.print("Ngay khong hop le!");
        }
    }
}
