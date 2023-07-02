package Bai5;

import java.time.LocalDate;

public class VietNam extends Dien{
	private String doiTuong;
	private int dinhMuc;
	
	
	public VietNam() {
	}

	public VietNam(String ma, String ten, LocalDate ngayLap, double soKW, double donGia, String doiTuong, int dinhMuc) {
		super(ma, ten, ngayLap, soKW, donGia);
		this.dinhMuc=dinhMuc;
		this.doiTuong=doiTuong;
	}


	public String getDoiTuong() {
		return doiTuong;
	}

	public void setDoiTuong(String doiTuong) {
		this.doiTuong = doiTuong;
	}

	public int getDinhMuc() {
		return dinhMuc;
	}

	public void setDinhMuc(int dinhMuc) {
		this.dinhMuc = dinhMuc;
	}

	@Override
	double tinhThanhTien() {
		double tien=0;
		if(getSoKW()<=getDinhMuc())
			tien=getSoKW()*getDonGia();
		else 
			tien=getSoKW()*getDinhMuc()*getDonGia()+(getSoKW()-getDinhMuc())*getDonGia()*2.5;
		return tien;
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
