package baitap4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class SoLanXuatHien {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Nhap vao mot chuoi: ");
		String xau = scan.nextLine();
		System.out.println("--------");
		StringTokenizer s = new StringTokenizer(xau, " ,\t,\n"); // chia chuoi thanh cac tu
		// init map
		Map<String, Integer> map = new HashMap<String, Integer>();
		// chua cac tu va tan suat xh cua cac tu
		// mỗi cặp từ và gtri là mục nhập
		ArrayList<String> a = new ArrayList<>();
		String st = "";
		while (s.hasMoreElements()) { // ktra xem co nhieu token san ko
			st = s.nextToken();
			a.add(st); // luu tung tu vao mang
			map.put(st, 0); // chèn một mục nhập vào trg map
		}
		for (String string : a) {
			String tu = string;
			if (map.containsKey(tu)) { // tim kiem tu
				int dem = map.get(tu); // lay tan suat cua tu
				map.remove(tu); // xoa mot muc nhap
				map.put(tu, dem + 1); // chen vao map
			}
		}

		// show map
		Set<String> set = map.keySet();
		System.out.println("So lan xuat hien cua moi tu trong xau: ");
		for (String string : set) {
			System.out.println(string + "\t: " + map.get(string));
		}
	}
}
