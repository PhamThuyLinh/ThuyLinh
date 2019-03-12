package baitap5;

import java.util.Scanner;

public class XuatHienTrgMgMotLan {
	static Scanner scan = new Scanner(System.in);
	static int[] a;
	static int n;

	public static void nhap() {
		boolean cont = true;

		do {
			cont = true;
			try {
				System.out.print("Nhap n phan tu: ");
				n = Integer.parseInt(scan.nextLine());
				if (n <= 0) {
					throw new Exception("Ban phai nhap so nguyen lon hon 0!");
				}
				cont = false;
			} catch (NumberFormatException e) {
				System.out.println("Ban phai nhap so nguyen!");
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

	public static void xuat() {
		System.out.print("Các phần tử trong mảng: ");
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	public void inkq() {
		int i, j, dem;
		for (i = 0; i < n; i++) {
			dem = 0;
			for (j = 0; j < n; j++) {
				if (a[i] == a[j] && i != j) {
					dem = 1;
				}
			}
			if (dem == 0) {
				System.out.print(a[i] + " ");
			}
		}

	}

	public static void main(String[] args) {
		XuatHienTrgMgMotLan obj = new XuatHienTrgMgMotLan();
		obj.nhap();
		obj.xuat();
		System.out.print("\nCac pt xuat hien 1 lan la: ");
		obj.inkq();
	}

}
