package DIEM;
import java.util.Scanner;
public class DIEM {
	    double x, y;
	    void nhapDiem() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhap toa do x: ");
	        x = scanner.nextDouble();
	        System.out.print("Nhap toa do y: ");
	        y = scanner.nextDouble();
	    }
	}

	class TamGiac extends DIEM {
	    DIEM A, B, C;

	    void nhapTG() {
	        A = new DIEM();
	        B = new DIEM();
	        C = new DIEM();
	        System.out.println("Nhap toa do diem A:");
	        A.nhapDiem();
	        System.out.println("Nhap toa do diem B:");
	        B.nhapDiem();
	        System.out.println("Nhap toa do diem C:");
	        C.nhapDiem();
	    }

	    double canh(DIEM d1, DIEM d2) {
	        return Math.sqrt(Math.pow((d2.x - d1.x), 2) + Math.pow((d2.y - d1.y), 2));
	    }

	    boolean kiemTra() {
	        double AB = canh(A, B);
	        double BC = canh(B, C);
	        double CA = canh(C, A);
	        return (AB + BC > CA) && (BC + CA > AB) && (CA + AB > BC);
	    }

	    double chuVi() {
	        double AB = canh(A, B);
	        double BC = canh(B, C);
	        double CA = canh(C, A);
	        return AB + BC + CA;
	    }

	    double dienTich() {
	        double AB = canh(A, B);
	        double BC = canh(B, C);
	        double CA = canh(C, A);
	        double p = (AB + BC + CA) / 2;
	        return Math.sqrt(p * (p - AB) * (p - BC) * (p - CA));
	    }
	}

	class DuongTron extends DIEM {
	    double r;

	    void nhapDT() {
	        System.out.println("Nhap toa do tam duong tron:");
	        nhapDiem();
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhap ban kinh: ");
	        r = scanner.nextDouble();
	    }

	    double chuVi() {
	        return 2 * Math.PI * r;
	    }

	    double dienTich() {
	        return Math.PI * r * r;
	    }
	}
