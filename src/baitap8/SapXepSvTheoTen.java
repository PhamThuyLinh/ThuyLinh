package baitap8;

import java.util.Comparator;

public class SapXepSvTheoTen implements Comparator<SinhVien> {
	@Override
	public int compare(SinhVien s1, SinhVien s2) {
		return s1.getName().compareTo(s2.getName());
	}
}
