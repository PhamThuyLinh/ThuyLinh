package baitap7;

import java.util.Scanner;

public class SapXepTangDanVaChen {
	public static Scanner scan = new Scanner(System.in);
	public static int[] a;
	public static int n;

	public void nhap() {
		boolean cont = true;
		do {
			cont = true;
			try {
				System.out.print("Nhap so phan tu trong mang: ");
				n = Integer.parseInt(scan.nextLine());
				if (n <= 0) {
					throw new Exception("Vui long nhap so nguyen lon hon 0!");
				}
				cont = false;
			} catch (NumberFormatException e) {
				System.out.println("Vui long nhap so nguyen!");
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}
		} while (cont);

		a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap a[" + i + "]: ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
	}

	public void xuat() {
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	public void tangDan() {
		int temp = a[0];
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
	}

	public void chen() {
		System.out.print("\nNhap 1 so: ");
		int so = Integer.parseInt(scan.nextLine());
		int[] aN = new int[n + 1]; //tao mang moi lon hon 1 ptu
		for (int i = 0; i < n; i++) {
			aN[i] = a[i];
		}
		aN[n] = so;//so vua chen bo vao vitri cuoi
		int temp = aN[0];
		for (int i = 0; i < aN.length; i++) {
			for (int j = i + 1; j < aN.length; j++) {
				if (aN[i] > aN[j]) {
					temp = aN[j];
					aN[j] = aN[i];
					aN[i] = temp;
				}
			}
		}
		System.out.print("\nMang sau khi chen: ");
		for (int i : aN) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		SapXepTangDanVaChen obj = new SapXepTangDanVaChen();
		obj.nhap();
		System.out.print("Cac phan tu trong mang: ");
		obj.xuat();
		System.out.print("\nMang duoc sap xep tang dan la: ");
		obj.tangDan();
		obj.xuat();
		obj.chen();

	}

}
