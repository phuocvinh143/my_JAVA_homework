package session3;

import java.util.Scanner;
import session2.Date;

public class SinhVien {
    private final int MAX = 10;
    private String mssv, hten;
    private Date ngSinh;
    private int sluong;
    public String [] tenHP, diem;

    public SinhVien(){
        mssv = "";
        hten = "";
        ngSinh = new Date();
        sluong = 0;
        tenHP=new String[MAX];
        diem = new String[MAX];
        for(int i = 0; i < MAX; ++i){
            tenHP[i] = "";
            diem[i] = "";
        }
    }

    public SinhVien(SinhVien s){
        mssv = s.mssv;
        hten = s.hten;
        ngSinh = new Date(s.ngSinh);
        sluong = s.sluong;
        tenHP = new String[MAX];
        diem = new String[MAX];
        for(int i = 0; i < MAX; ++i){
            tenHP[i] = s.tenHP[i];
            diem[i] = s.diem[i];
        }
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mssv: ");
        mssv = sc.nextLine();
        System.out.print("Nhap hoten: ");
        hten = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngSinh.nhapNgayThangNam();
    }

    public void nhapDiem(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("\nNhap so luong mon hoc: ");
            sluong = sc.nextInt();
        } while (sluong > MAX);

        System.out.print("Nhap cac Mon hoc : \n");

        sc.nextLine();

        for(int i=0;i<sluong;i++){
            System.out.printf("Nhap ten Mon hoc thu %d: ", i+1);
            tenHP[i] = sc.nextLine();
            System.out.printf("Nhap diem Mon hoc thu %d: ", i+1);
            diem[i] = sc.nextLine();
        }

    }

    public String toString(){
        String s = mssv + "," + hten + "," + ngSinh.toString() + "[";
        for(int i = 0; i < sluong; ++i){
            s += tenHP[i] + ":" + diem[i] + ";";
        }
        s += "]";
        return s;
    }

    public void in() {
        System.out.println("Thong tin sinh vien: \n" + this.toString());
    }
    public String getMssv() {
        return mssv;
    }
    public String getHten() {
        return hten;
    }
    public Date getNgSinh() { return ngSinh; }
    public int getSluong() {return sluong; }

    public void dKy(String ten, String d){
        if(sluong < MAX ){
            tenHP[sluong]= ten;
            diem[sluong]= d;
            sluong++;
        }
        else System.out.println("Khong the them mon moi");
    }

    public void xoa(String ten){
        for(int i = 0; i < sluong; ++i) {
            if(tenHP[i].compareTo(ten) == 0) {
                for (int j = i; j < sluong - 1; ++j){
                    tenHP[j] = tenHP[j+1];
                }
                --sluong;
                break;
            }
        }
    }

    public float diemTB(){
        float d = 0F;
        for(int i = 0; i < sluong; ++i){
            if(diem[i].equals("A")) d += 4;
            else if(diem[i].equals("B")) d += 3;
            else if(diem[i].equals("C")) d += 2;
            else if(diem[i].equals("D")) d += 1;
        }
        return d/sluong;
    }
}
