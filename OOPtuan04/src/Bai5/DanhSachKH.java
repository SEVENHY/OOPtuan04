package Bai5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DanhSachKH {
	private List<Dien> ds;
	public DanhSachKH() {
		this.ds=new ArrayList<>();
	}
	public void themKH(Dien e) {
		this.ds.add(e);
	}
	public void tinhSoLuong() {
		int tong=0, tong1=0;
		for (Dien dien : ds) {
			if(dien instanceof VietNam)
				tong++;
			else 
				tong1++;
		}
		System.out.printf("So luong khach hang trong nuoc: %s, ngoai nuoc: %s",tong,tong1);
	}
	public double tinhTB() {
		double tong=0;
		int dem=0;
		for (Dien dien : ds) {
			if(dien instanceof NuocNgoai) {
				dem++;
				tong+=dien.tinhThanhTien();
			}	
		}
		return tong/dem;
	}
	public void xuatHD() {
		for (Dien dien : ds) {
			if(dien.getNgayLap().isBefore(LocalDate.of(2018,10,1)) && dien.getNgayLap().isAfter(LocalDate.of(2018, 7, 31))) {
				System.out.println(dien);
			}
		}
	}
}
