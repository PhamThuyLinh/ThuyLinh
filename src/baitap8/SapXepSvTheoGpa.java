package baitap8;

import java.util.Comparator;

public class SapXepSvTheoGpa implements Comparator<SinhVien> {
	@Override
	public int compare(SinhVien s1, SinhVien s2) {
		if (s1.getGpa() > s2.getGpa()) {
			return 1;
		}
		return -1;
	}
}
