package session3;

import java.util.Scanner;

public class SDSinhVien {
    public static void main(String[] args) {
        SinhVien svNam = new SinhVien();
        svNam.nhap();
        svNam.dKy("LTHDT", "A");
        svNam.in();

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("\n nhap so sinh vien: ");
        n = sc.nextInt();
        SinhVien ds[] = new SinhVien[n];
        for(int i=0; i< n;i++) ds[i] = new SinhVien();

        for(int i=0; i< n;i++){
            System.out.printf("\n + Nhap sinh vien thu %d : \n", i+1);
            ds[i].nhap();
            ds[i].nhapDiem();
        }

        System.out.println("** Danh sach sinh vien bi canh bao hoc vu **");
        for(int i=0; i< n;i++)
            if (ds[i].diemTB() < 1)
                System.out.printf("%s , diem TB: %.2f \n", ds[i].toString(), ds[i].diemTB());

        System.out.print("Nhap MSSV: ");
        sc.nextLine();
        String mssv_inp = new String();
        mssv_inp = sc.nextLine();
        for (int i=0; i<n; i++) {
            if (ds[i].getMssv().equals(mssv_inp)) System.out.print(ds[i].getHten());
        }
    }
}
