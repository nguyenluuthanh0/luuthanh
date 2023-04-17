package bai3_1;
import java.util.Scanner;

public class SACH {
    private String maSach;
    private String tenSach;
    private String tenTacGia;
    private int soTrang;
    private String loaiSach;
    private String nhaXuatBan;
    private int soTap;
    private double gia;

    public SACH() {}

    public void nhapSach() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ma sach: ");
        this.maSach = scanner.nextLine();

        System.out.print("Nhap ten sach: ");
        this.tenSach = scanner.nextLine();

        System.out.print("Nhap ten tac gia: ");
        this.tenTacGia = scanner.nextLine();

        System.out.print("Nhap so trang: ");
        this.soTrang = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhap loai sach: ");
        this.loaiSach = scanner.nextLine();

        System.out.print("Nhap nha xuat ban: ");
        this.nhaXuatBan = scanner.nextLine();

        System.out.print("Nhap so tap: ");
        this.soTap = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhap gia: ");
        this.gia = scanner.nextDouble();
    }

    public void inSach() {
        System.out.println("Ma sach: " + this.maSach);
        System.out.println("Ten sach: " + this.tenSach);
        System.out.println("Ten tac gia: " + this.tenTacGia);
        System.out.println("So trang: " + this.soTrang);
        System.out.println("Loai sach: " + this.loaiSach);
        System.out.println("Nha xuat ban: " + this.nhaXuatBan);
        System.out.println("So tap: " + this.soTap);
        System.out.println("Gia: " + this.gia);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin 1 cuốn sách và hiển thị thông tin cuốn sách vừa nhập.
        SACH sach = new SACH();
        System.out.println("Nhap thong tin cuon sach:");
        sach.nhapSach();
        sach.inSach();

        // Nhập danh sách các đầu sách của thư viện và in danh sách các cuốn sách đã nhập.
        System.out.print("Nhap so luong sach: ");
        int n;
        n = scanner.nextInt();
        scanner.nextLine();

        SACH[] dsSach = new SACH[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cuon sach thu " + (i + 1));
            dsSach[i] = new SACH();
            dsSach[i].nhapSach();
        }

        System.out.println("Danh sach cac cuon sach da nhap:");
        for (SACH s : dsSach) {
            s.inSach();
        }
    }
}
