package Bai4;

import java.time.LocalDate;

public class Nha extends NhaDat{
	private String loaiNha;
	private String diaChi;
	
	public Nha() {
	}

	public Nha(String ma, LocalDate ngayGD, double donGia, double dienTich, String loaiNha, String diaChi) {
		super(ma, ngayGD, donGia, dienTich);
		this.diaChi=diaChi;
		this.loaiNha=loaiNha;
	}

	public String getLoaiNha() {
		return loaiNha;
	}

	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	double tinhThanhTien() {
		double tien=0;
		if(getLoaiNha()=="cao cap")
			tien=getDienTich()*getDonGia();
		else 
			tien=getDienTich()*getDonGia()*90/100;
		return tien;
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
