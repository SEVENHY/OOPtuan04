package Bai3;

import java.time.LocalDate;

public class KTGiaoDich {
	public static void main(String[] args) {
		DanhSachGD ds=new DanhSachGD();
		GiaoDich gd1=new Vang("11",LocalDate.of(2003,12, 16),12000,1,"ma");
		ds.themGD(gd1);
		ds.tinhTB();
		ds.tinhTongSL();
	}
}
