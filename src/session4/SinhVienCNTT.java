package session4;

import session3.SinhVien;

public class SinhVienCNTT extends SinhVien {
    private String taikhoan, matkhau, email;
    public SinhVienCNTT() {
        super.nhap();
        taikhoan = new String(super.getMssv());
        matkhau = new String("123456");
        String splitHoTen[] = super.getHten().split(" ");
        email = new String(splitHoTen[splitHoTen.length-1].toLowerCase() + super.getMssv().toLowerCase() + "@student.ctu.edu.vn");
    }
    public String toString() {
        String s = super.getMssv() + "," + super.getHten() + "," + super.getNgSinh().toString() + ", [";
        for (int i = 0; i < super.getSluong(); ++i) {
            s += tenHP[i] + ":" + diem[i] + ";";
        }
        s += "]\n" + "Tai Khoan: " + taikhoan + "\n" + "Mat Khau: " + matkhau + "\n" + "Email: " + email + "\n";
        return s;
    }
    public void doiMatKhau(String newpass) {
        matkhau = newpass;
    }
    public String getEmail() {
        return email;
    }
    public void hienThi() {
        System.out.print(this.toString());
    }
}
