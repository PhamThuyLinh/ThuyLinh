package baitap3;

import java.util.Scanner;

public class DemSoTuCuaXau {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Nhap vao mot chuoi: ");
		String xau = scan.nextLine();
		System.out.println("So tu cua chuoi la: " + demTu(xau));
	}

	public static int demTu(String xau) {
		if (xau == null) {
			return -1; // neu xau rong la sai
		}
		int dem = 0;
		boolean no = true;

		for (int i = 0; i < xau.length(); i++) {
			if ((xau.charAt(i) != ' ') && (xau.charAt(i) != '\t') && (xau.charAt(i) != '\n')) {
				if (no) {
					// System.out.println(xau.charAt(i));
					dem++;
					no = false; // neu la false thi khi van la chu thi bien dem ko tang cho den khi gap dau cach
				}
			} else {
				no = true; // chuyen sang true thi bien dem tang tiep ...
			}
		}
		return dem;
	}

}
// String[] arrStr = xau.split(" +");
// System.out.println("So tu cua chuoi la: ");
// int i = 0;
// for (String w : arrStr) {
// // System.out.println(w);
// i++;
// }
// System.out.println(i);
