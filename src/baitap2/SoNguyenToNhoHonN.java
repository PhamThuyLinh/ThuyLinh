package baitap2;

import java.util.Scanner;

public class SoNguyenToNhoHonN {
	public static Scanner scan = new Scanner(System.in);

	public static boolean laSoNguyenTo(int i) {
		// if (i < 2) {
		// System.out.println("So nguyen nho hon 2 khong phai la so nguyen to");
		// return false;
		// }

		// Số nguyên tố là số tự nhiên khác 0 chỉ chia hết cho 1 và chính nó.
		// Các số có nhiều hơn 2 ước số dương gọi là hợp số.
		// Ước số dương bé nhất khác 1 của một hợp số i là một số nguyên tố không vượt
		// quá căn i
		int canHai = (int) Math.sqrt(i);
		for (int j = 2; j <= canHai; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int n = 0;
		boolean cont = true;
		do {
			cont = true;
			try {
				System.out.print("Nhap vao 1 so nguyen bat ky: ");
				n = Integer.parseInt(scan.nextLine());
				if (n < 0) {
					throw new Exception("Ban phai nhap so nguyen lon hon 1 !");
				}
				cont = false;
			} catch (NumberFormatException e) {
				System.out.println("Ban phai nhap so nguyen duong !");
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}
		} while (cont);
		if (n == 0 || n == 1) {
			System.out.println("Khong co so nguyen to nho hon " + n);
		}
		if (n >= 2) {
			System.out.print(2); // 2 la so nguyen to chan duy nhat
		}
		for (int i = 3; i < n; i += 2) { // con lai la so nguyen to le
			if (laSoNguyenTo(i)) {
				System.out.print(" " + i);
			}
		}
	}

}
