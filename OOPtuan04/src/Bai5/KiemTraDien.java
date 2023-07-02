package Bai5;

import java.time.LocalDate;

public class KiemTraDien {
	public static void main(String[] args) {
		DanhSachKH ds=new DanhSachKH();
		Dien vn1=new VietNam("111","Nam", LocalDate.of(2018, 8, 12),120,60,"sinh hoat",100);
		ds.themKH(vn1);
		ds.tinhSoLuong();
		ds.tinhTB();
	}
}
