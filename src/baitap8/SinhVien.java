package baitap8;

public class SinhVien {
	private int id;
	private String name;
	private int age;
	private String address;
	private float gpa;

	public SinhVien() {
		super();
	}

	public SinhVien(int id, String name, int age, String address, float gpa) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.gpa = gpa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public String toString() {
		return "Id: " + this.id + "\nTen: " + this.name + "\nTuoi: " + this.age + "\nDia chi: " + this.address
				+ "\nDtb: " + this.gpa;
		// return "%5d | "
		// +this.id+"%20s | "+this.name+"%5d | "+this.age+"%20s
		// |"+this.address+"%10.1f%n"+this.gpa;
	}

}
