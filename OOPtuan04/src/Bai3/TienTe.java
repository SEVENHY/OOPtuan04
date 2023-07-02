package Bai3;

import java.time.LocalDate;

public class TienTe extends GiaoDich{
	private double tiGia;
	private String loai;
	
	public TienTe() {
	}

	public TienTe(String ma, LocalDate ngay, double donGia, int soLuong, double tiGia, String loai) {
		super(ma, ngay, donGia, soLuong);
		this.loai=loai;
		this.tiGia=tiGia;
	}

	public double getTiGia() {
		return tiGia;
	}

	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
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
		if(getLoai()=="USD" || getLoai()=="Euro")
			tien=getSoLuong()*getDonGia()*getTiGia();
		else 
			tien=getSoLuong()*getDonGia();
		return tien;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
