package session2;

import java.util.Scanner;

public class SDPhanSo {
    public static void main(String[] args) {
//        // 1
//        PhanSo a = new PhanSo(3, 7);
//        PhanSo b = new PhanSo(4, 9);
//        a.in();
//        b.in();
//
//        // 2 3
//        PhanSo x = new PhanSo();
//        PhanSo y = new PhanSo();
//        x.nhapPS();
//        y.nhapPS();
//        x.giaTriNghichDao().in();
//        x.in();
//
//        // 4
//        x.cong(y).in();

        // 5 6 7
        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PhanSo arr[] = new PhanSo[n+7];
        PhanSo tmp = new PhanSo(), sum = new PhanSo();
        for (int i = 1; i <= n; ++i) {
            arr[i] = new PhanSo();
            System.out.println("Phan so thu " + i + " co");
            arr[i].nhapPS();
            if (i == 1) {
                tmp.gan(arr[i]);
                sum.gan(arr[i]);
            }
            else {
                sum = sum.cong(arr[i]);
                if (arr[i].lonHon(tmp)) tmp.gan(arr[i]);
            }
        }
        System.out.print("Tong n phan so = ");
        sum.in();
        System.out.print("Phan so lon nhat = ");
        tmp.in();

        // 8
        for (int i = 1; i < n; ++i) {
            for (int j = i + 1; j <= n; ++j) {
                if (arr[i].lonHon(arr[j])) {
                    tmp.gan(arr[i]);
                    arr[i].gan(arr[j]);
                    arr[j].gan(tmp);
                }
            }
        }
        for (int i = 1; i <= n; ++i){
            arr[i].in();
        }
    }
}
