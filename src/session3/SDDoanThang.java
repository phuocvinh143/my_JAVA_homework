package session3;

import session2.Diem;

public class SDDoanThang {
    public static void main(String[] args) {
        Diem a = new Diem(2,1);
        Diem b = new Diem(5,3);
        DoanThang ab = new DoanThang(a,b);
        ab.doiDiem(1,2);
        ab.hienThi();
        DoanThang cd = new DoanThang(3, 3, 6, 5);
        if (cd.trungNhau(ab)) System.out.println("Hai dt trung nhau!");
        else System.out.println ("Hai dt khong trung nhau!");
        cd.hienThi();
    }
}
