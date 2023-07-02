package Bai5;

import java.time.LocalDate;

public class NuocNgoai extends Dien{
	private String quocTich;
	
	public NuocNgoai() {
	}

	public NuocNgoai(String ma, String ten, LocalDate ngayLap, double soKW, double donGia, String quocTich) {
		super(ma, ten, ngayLap, soKW, donGia);
		this.quocTich=quocTich;
	}

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	@Override
	double tinhThanhTien() {
		double tien=0;
		tien=getSoKW()*getDonGia();
		return tien;
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
