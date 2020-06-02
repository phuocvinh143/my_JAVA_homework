package session4;

import java.util.Scanner;

public class De extends ConVat {
    public De() {
        super.fur_color = new String("white");
        super.species = new String("dont know");
        super.weight = 100;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap can nang: ");
        super.weight = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap giong loai: ");
        super.species = sc.nextLine();
        System.out.print("Nhap mau long: ");
        super.fur_color = sc.nextLine();
    }
    public void in() {
        System.out.println("[" + fur_color + ", " + species + ", " + weight + "]");
        this.Keu();
    }
    @Override
    public void Keu() {
        System.out.println("De");
    }
}
