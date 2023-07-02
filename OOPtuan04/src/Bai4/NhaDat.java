package Bai4;

import java.time.LocalDate;

public abstract class NhaDat {
	private String ma;
	private String ten;
	private LocalDate ngayLap;
	private double soKW;
	private double donGia;
	
	public NhaDat() {
	}
	public NhaDat(String ma, String ten, LocalDate ngayLap, double soKW, double donGia) {
		this.ma = ma;
		this.ten = ten;
		this.ngayLap = ngayLap;
		this.soKW = soKW;
		this.donGia = donGia;
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public LocalDate getNgayLap() {
		return ngayLap;
	}
	public void setNgayLap(LocalDate ngayLap) {
		this.ngayLap = ngayLap;
	}
	public double getSoKW() {
		return soKW;
	}
	public void setSoKW(double soKW) {
		this.soKW = soKW;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	
	abstract double tinhThanhTien();
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}
