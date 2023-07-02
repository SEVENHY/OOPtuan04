package Bai3;

import java.time.LocalDate;
public abstract class GiaoDich {
	private String ma;
	private LocalDate ngay;
	private double donGia;
	private int soLuong;
	public GiaoDich() {
	}
	public GiaoDich(String ma, LocalDate ngay, double donGia, int soLuong) {
		this.ma = ma;
		this.ngay = ngay;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
	abstract double tinhThanhTien();
	
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public LocalDate getNgay() {
		return ngay;
	}
	public void setNgay(LocalDate ngay) {
		this.ngay = ngay;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
