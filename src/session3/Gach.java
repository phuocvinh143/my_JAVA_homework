package session3;

import java.awt.*;
import java.util.Scanner;

public class Gach {
    private String ID, color;
    private int num, length, width;
    private long price;
    public Gach() {
        ID = color = "";
        num = length = width = 0;
        price = 0;
    }
    public Gach(String ID, String color, int num, int length, int width, long price) {
        this.ID = ID;
        this.color = color;
        this.num = num;
        this.length = length;
        this.width = width;
        this.price = price;
    }
    public int nhapSo() {
        int n = 0; String s; boolean error = false;
        Scanner sc = new Scanner(System.in);
        do {
            s = sc.next();
            try {
                n = Integer.parseInt(s);
                error = false;
                if (n < 0) {
                    System.out.print("Nhap lai mot so nguyen duong: ");
                    error = true;
                }
            }
            catch (NumberFormatException e) {
                System.out.print("Nhap lai mot so nguyen: ");
                sc.nextLine();
                error = true;
            }

        } while(error);
        return n;
    }
    public void NhapThongTinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        ID = sc.nextLine();
        System.out.print("Color: ");
        color = sc.nextLine();
        System.out.print("Amount: ");
        num = nhapSo();
        System.out.print("length of brick: ");
        length = nhapSo();
        System.out.print("Width of brick: ");
        width = nhapSo();
        System.out.print("Price: ");
        price = nhapSo();
    }
    public void InThongTinh() {
        System.out.print("ID: " + ID);
        System.out.print("Color: " + color);
        System.out.print("Amount: " + num);
        System.out.print("length of brick: " + length);
        System.out.print("Width of brick: " + width);
        System.out.print("Price: " + price);
    }
    public float GiaBanLe() {
        return (float)(price*1.2);
    }
    public int DienTich() {
        return length*width*num;
    }
    public int soLuongHop(int D, int N) {
        int c1r = (N + length - 1)/length;
        int c1d = (D + width - 1)/width;

        int c2r = (D + length - 1)/length;
        int c2d = (N + width - 1)/width;

        return Math.min(c1r*c1d, c2d*c2r);
    }
}
