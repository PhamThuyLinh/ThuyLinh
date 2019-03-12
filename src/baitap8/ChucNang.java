package baitap8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ChucNang {
	Scanner scan = new Scanner(System.in);
	ArrayList<SinhVien> sv = new ArrayList<>();
	boolean cont = true;

	public void menu() {
		System.out.println("-------------");
		System.out.println("--1.Them sinh vien");
		System.out.println("--2.Chinh sua sinh vien");
		System.out.println("--3.Xoa sinh vien");
		System.out.println("--4.Sap xep sinh vien theo dtb");
		System.out.println("--5.Sap xep sinh vien theo ten");
		System.out.println("--6.Xuat du lieu");
		System.out.println("--0.Thoat");
		System.out.println("-------------");
	}

	public void nhap() {
		System.out.print("Nhap so sinh vien muon them: ");
		int n = 0;
		boolean cont = true;
		do {
			cont = true;
			try {
				n = Integer.parseInt(scan.nextLine());
				if (n < 0) {
					throw new Exception("Vui long nhap so nguyen > 0 !");
				}
				cont = false;
			} catch (NumberFormatException e) {
				System.out.println("Vui long nhap so!");
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}
		} while (cont);

		System.out.println("--Nhap sinh vien: ");
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap sinh vien thu " + (i + 1) + ": ");

			int id = nhapId();
			String name = nhapTen();
			int age = nhapTuoi();
			String address = nhapDiaChi();
			float gpa = nhapDtb();

			SinhVien a = new SinhVien(id, name, age, address, gpa);
			sv.add(a);
		}
	}

	public void xuat() {
		System.out.println("--Hien thi danh sach sinh vien");
		for (SinhVien sinhVien : sv) {
			// System.out.println(sinhVien.toString());
			// System.out.println("--------");
			System.out.print(sinhVien.getId());
			System.out.print("\t | " + sinhVien.getName());
			System.out.print("\t | " + sinhVien.getAge());
			System.out.print("\t | " + sinhVien.getAddress());
			System.out.print("\t | " + sinhVien.getGpa());
			System.out.println("");

		}
	}

	public void sua(int id) {
		System.out.print("Sinh vien muon sua co id la: ");
		id = Integer.parseInt(scan.nextLine());
		boolean tontai = false;
		for (SinhVien sinhVien : sv) {
			if (sinhVien.getId() == id) {
				tontai = true;
				sinhVien.setName(nhapTen());
				sinhVien.setAge(nhapTuoi());
				sinhVien.setAddress(nhapDiaChi());
				sinhVien.setGpa(nhapDtb());
				break;
			}
		}
		if (!tontai) {
			System.out.println("id=" + id + " khong ton tai!");
		} else {

		}
	}

	public void xoa(int id) {
		SinhVien rong = null;
		System.out.print("Sinh vien muon xoa co id la: ");
		id = Integer.parseInt(scan.nextLine());
		for (SinhVien sinhVien : sv) {
			if (sinhVien.getId() == id) {
				rong = sinhVien;
				break;
			}
		}
		if (rong != null) {
			sv.remove(rong);
		} else {
			System.out.println("Id=" + id + " khong ton tai!");
		}
	}

	public void sapXepTheoTen() {
		Collections.sort(sv, new SapXepSvTheoTen());
		System.out.print("TANG DAN THEO TEN");
		xuat();
		System.out.print("GIAM DAN THEO TEN");
		Collections.reverse(sv);
		xuat();
	}

	public void sapXepTheoGpa() {
		Collections.sort(sv, new SapXepSvTheoGpa());
		System.out.print("TANG DAN THEO DTB");
		xuat();
		System.out.print("GIAM DAN THEO DTB");
		Collections.reverse(sv);
		xuat();
	}

	//
	public int nhapId() {
		int id = 0;
		do {
			cont = true;
			try {
				System.out.print("Id: ");
				id = Integer.parseInt(scan.nextLine());
				for (SinhVien sinhVien : sv) {
					if (sinhVien.getId() == id) {
						throw new Exception("Ban khong duoc nhap trung id!");
					}
				}
				cont = false;
			} catch (NumberFormatException e) {
				System.out.println("Vui long nhap so!");
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}
		} while (cont);
		return id;
	}

	private String nhapTen() {
		System.out.print("Ten: ");
		return scan.nextLine();
	}

	@SuppressWarnings("unused")
	private int nhapTuoi() {
		int age = 0;
		do {
			cont = true;
			try {
				System.out.print("Tuoi: ");
				age = Integer.parseInt(scan.nextLine());
				if (age < 0 || age > 100) {
					throw new Exception("Tuoi trong khoang tu 0 den 100!");
				}
				cont = false;
			} catch (NumberFormatException e) {
				System.out.println("Vui long nhap so!");
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}
		} while (cont);
		return age;
	}

	@SuppressWarnings("unused")
	private String nhapDiaChi() {
		System.out.print("Dia chi: ");
		return scan.nextLine();
	}

	@SuppressWarnings("unused")
	private float nhapDtb() {
		float gpa = 0;
		do {
			cont = true;
			try {
				System.out.print("Dtb: ");
				gpa = Float.parseFloat(scan.nextLine());
				if (gpa < 0.0 || gpa > 10.0) {
					throw new Exception("Diem trong khoang tu 0.0 den 10.0!");
				}
				cont = false;
			} catch (NumberFormatException e) {
				System.out.println("Vui long nhap so!");
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}
		} while (cont);
		return gpa;
	}

	public void chon() {
		ChucNang c = new ChucNang();
		boolean cont = true;
		do {
			try {
				System.out.print("\nChon so tu 0 den 6: ");
				int so = Integer.parseInt(scan.nextLine());
				if (so < 0 || so > 6) {
					throw new Exception("Phai nhap tu 0 den 6!");
				}
				switch (so) {
				case 1:
					c.nhap();
					break;
				case 2:
					int id = 0;
					c.sua(id);
					break;
				case 3:
					int id1 = 0;
					c.xoa(id1);
					break;
				case 4:
					c.sapXepTheoGpa();
					break;
				case 5:
					c.sapXepTheoTen();
					break;
				case 6:
					c.xuat();
					break;
				case 0:
					System.out.println("Thoat!");
					cont = false;
					break;
				}

			} catch (NumberFormatException e) {
				System.out.println("Phai nhap so!");
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}
		} while (cont);
	}

}
