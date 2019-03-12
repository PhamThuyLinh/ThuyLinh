package baitap1;

import java.util.Scanner;

public class GiaiThua {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		long giaiThua = 1;
		boolean cont = true;

		do {
			cont = true;
			try {
				System.out.print("Nhap vao 1 so bat ky: ");
				n = Integer.parseInt(scan.nextLine());
				if (n < 0) {
					throw new Exception("Ban phai nhap so nguyen lon hon hoac bang 0!");
				}
				cont = false;
			} catch (NumberFormatException e) {
				System.out.println("Ban phai nhap so nguyen!");
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}

		} while (cont);

		if (n == 0) {
			giaiThua = 1;
		}
		// 0!=1
		// n! = 1x2x3x...xn
		for (int i = 1; i <= n; i++) {
			giaiThua *= i;
		}
		System.out.println(n + "! = " + giaiThua);
	}

}
