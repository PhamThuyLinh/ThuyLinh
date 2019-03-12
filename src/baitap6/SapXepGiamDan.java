package baitap6;

import java.util.Scanner;

public class SapXepGiamDan {
	static Scanner scan = new Scanner(System.in);
	static int[] a;
	static int n;

	public void nhap() {
		boolean cont = true;
		do {
			cont = true;
			try {
				System.out.print("Nhap so phan tu trong mang: ");
				n = Integer.parseInt(scan.nextLine());
				if (n <= 0) {
					throw new Exception("Ban phai nhap so nguyen lon hon 0!");
				}
				cont = false;
			} catch (NumberFormatException e) {
				System.out.println("Phai nhap so nguyen!");
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}
		} while (cont);
		a = new int[n];
		for (int i = 0; i < n; i++) {
			
			do {
				cont = true;
				try {
					System.out.print("Nhap a[" + i + "]: ");
					a[i] = Integer.parseInt(scan.nextLine());
					cont = false;
				} catch (NumberFormatException e) {
					System.out.println("Phai nhap so nguyen!");
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
			} while (cont);
		}
	}

	public void xuat() {
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	public void giamDan() {
		int temp = a[0];
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] < a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		SapXepGiamDan obj = new SapXepGiamDan();
		obj.nhap();
		System.out.print("Cac phan tu trong mang la: ");
		obj.xuat();
		System.out.print("\nMang duoc sap xep giam dan la: ");
		obj.giamDan();
		obj.xuat();
	}
}
