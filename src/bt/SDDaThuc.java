package bt;

public class SDDaThuc {
    public static void main(String[] args) {
        DaThuc d1 = new DaThuc();
        d1.nhapDaThuc();
        d1.inDaThuc();
        DaThuc d2 = new DaThuc();
        d2.nhapDaThuc();
        d2.inDaThuc();
        d1.cong(d2).inDaThuc();
        d1.tru(d2).inDaThuc();
        d1.nhan(d2).inDaThuc();
        d1.chia(d2).inDaThuc();
    }
}
