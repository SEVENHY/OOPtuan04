package Bai4;

import java.time.LocalDate;

public abstract class NhaDat {
	private String ma;
	private LocalDate ngayGD;
	private double donGia;
	private double dienTich;
	
	public NhaDat() {
	}
	public NhaDat(String ma, LocalDate ngayGD, double donGia, double dienTich) {
		this.ma = ma;
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}
	
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public LocalDate getNgayGD() {
		return ngayGD;
	}
	public void setNgayGD(LocalDate ngayGD) {
		this.ngayGD = ngayGD;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	
	abstract double tinhThanhTien();
	
	@Override
	public String toString() {
		return super.toString();
	}
}
