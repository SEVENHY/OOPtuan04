package Bai4;

import java.time.LocalDate;

public class Dat extends NhaDat{
	private String loai;
	
	public Dat() {
	}

	public Dat(String ma, LocalDate ngayGD, double donGia, double dienTich, String loai) {
		super(ma, ngayGD, donGia, dienTich);
		this.loai=loai;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	@Override
	double tinhThanhTien() {
		double tien=0;
		if(getLoai()=="A")
			tien=getDienTich()*getDonGia()*1.5;
		else
			tien=getDienTich()*getDonGia();
		return tien;
	}
}
