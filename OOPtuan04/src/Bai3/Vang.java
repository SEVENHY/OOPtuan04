package Bai3;

import java.time.LocalDate;

public class Vang extends GiaoDich{
	private String loai;
	
	public Vang() {
	}

	public Vang(String ma, LocalDate ngay, double donGia, int soLuong, String loai) {
		super(ma, ngay, donGia, soLuong);
		this.loai=loai;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	@Override
	double tinhThanhTien() {
		double tien=0;
		tien=getSoLuong()*getDonGia();
		return tien;
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
