package bt;

import java.util.Scanner;

public class DaThuc {
    private int [] heSo;
    private int heSo_max;
    public DaThuc() {
        heSo_max = 0;
        heSo = new int[105];
        for (int i = 0; i <= 100; ++i) heSo[i] = 0;
    }
    public DaThuc(int max) {
        heSo_max = max;
        heSo = new int[max + 5];
        for (int i = 0; i <= heSo_max; ++i) heSo[i] = 0;
    }
    public DaThuc(DaThuc d) {
        heSo_max = d.heSo_max;
        heSo = new int[d.heSo_max + 5];
        for (int i = 0; i <= heSo_max; ++i) heSo[i] = d.heSo[i];
    }
    public DaThuc(int heSo, int bac) {
        this.heSo = new int[105];
        for (int i = 0; i <= 100; ++i) this.heSo[i] = 0;
        heSo_max = bac;
        this.heSo[bac] = heSo;
    }
    public void nhapDaThuc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap bac cao nhat cua da thuc: ");
        heSo_max = sc.nextInt();
        for (int i = 0; i <= heSo_max; ++i) {
            System.out.print("Nhap he so cua bac " + i + ": ");
            heSo[i] = sc.nextInt();
        }
    }
    public int calheSo_max() {
        for (int i = heSo_max; i >= 0; --i) if (heSo[i] != 0) return i;
        return 0;
    }
    public void inDaThuc() {
        for (int i = heSo_max; i >= 0; --i) {
            String a = " + ", b = "" + heSo[i], c = "X^", d = "" + i;
            if (heSo[i] == 0) continue;
            if ((heSo[i] == 1 || heSo[i] == -1) && i != 0) b = "";
            if (heSo[i] < 0 && b != "") {
                a = " - ";
                b = "" + (-heSo[i]);
            }
            if (i == heSo_max && heSo[i] > 0) a = "";
            if (i == heSo_max && heSo[i] == -1) a = "-";
            if (i == 1) {
                c = "X";
                d = "";
            }
            if (i == 0) {
                c = "";
                d = "";
            }
            System.out.print(a + b + c + d);
        }
        System.out.print("\n");
    }
    public DaThuc cong(DaThuc a) {
        DaThuc ans = new DaThuc(Math.max(heSo_max, a.heSo_max));
        for (int i = 0; i <= ans.heSo_max; ++i) ans.heSo[i] = heSo[i] + a.heSo[i];
        ans.heSo_max = ans.calheSo_max();
        return ans;
    }
    public DaThuc tru(DaThuc a) {
        DaThuc ans = new DaThuc(Math.max(heSo_max, a.heSo_max));
        for (int i = 0; i <= ans.heSo_max; ++i) ans.heSo[i] = heSo[i] - a.heSo[i];
        ans.heSo_max = ans.calheSo_max();
        return ans;
    }
    public DaThuc nhan(DaThuc a) {
        DaThuc ans = new DaThuc(heSo_max + a.heSo_max);
        for (int i = 0; i <= heSo_max; ++i) {
            for (int j = 0; j <= a.heSo_max; ++j) {
                ans.heSo[i+j] += (heSo[i]*a.heSo[j]);
            }
        }
        ans.heSo_max = ans.calheSo_max();
        return ans;
    }
    public DaThuc chia(DaThuc a) {
        DaThuc sc = new DaThuc(this);
        DaThuc sbc = new DaThuc(a);
        DaThuc thuong = new DaThuc();
        if (heSo_max < a.heSo_max) {
            System.out.print("Error!!!");
            return sc;
        }
        else {
            while (sc.heSo_max >= sbc.heSo_max) {
                DaThuc tmp = new DaThuc(sc.heSo[sc.heSo_max]/sbc.heSo[sbc.heSo_max], sc.heSo_max-sbc.heSo_max);
                tmp.inDaThuc();
                thuong.cong(tmp);
                sc = new DaThuc(sc.tru(tmp.nhan(sbc)));
                sc.heSo_max = sc.calheSo_max();
            }
        }
        return thuong;
    }
}
