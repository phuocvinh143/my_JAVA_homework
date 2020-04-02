package session2;

public class SDDiem {
    public static void main(String[] args) {
        // 1
        Diem a = new Diem(3,4);
        a.hienThi();

        // 2
        Diem b = new Diem();
        b.nhapDiem();
        b.hienThi();

        // 3
        Diem c = new Diem(-a.giaTriX(), -a.giaTriY());
        c.hienThi();

        // 4
        System.out.printf("Khoang cach tu B den O la: %.2f\n", b.khoangCach());

        // 5
        System.out.printf("Khoang cach tu A den B la: %.2f\n", a.khoangCach(b));
    }
}
