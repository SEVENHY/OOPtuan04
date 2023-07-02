package Bai4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DanhSachNhaDat {
	private List<NhaDat> ds;
	public DanhSachNhaDat() {
		this.ds=new ArrayList<>();
	}
	public void themGD(NhaDat e) {
		this.ds.add(e);
	}
	 
	public void tinhSoLuong() {
		int tong=0, tong1=0;
		for (NhaDat nhaDat : ds) {
			if(nhaDat instanceof Dat)
				tong++;
			else 
				tong1++;
		}
		System.out.printf("So luong khach hang dat: %s, nha: %s",tong,tong1);
	}
	public double tinhTB() {
		double tong=0;
		int dem=0;
		for (NhaDat nhaDat : ds) {
			if(nhaDat instanceof Dat) {
				dem++;
				tong+=nhaDat.tinhThanhTien();
			}	
		}
		return tong/dem;
	}
	public void xuatHD() {
		for (NhaDat nhaDat : ds) {
			if(nhaDat.getNgayGD().isBefore(LocalDate.of(2018,10,1)) && nhaDat.getNgayGD().isAfter(LocalDate.of(2018, 8, 31))) {
				System.out.println(nhaDat);
			}
		}
	}
}
