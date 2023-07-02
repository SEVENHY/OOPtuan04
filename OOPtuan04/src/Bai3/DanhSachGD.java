package Bai3;
import java.util.ArrayList;
import java.util.List;
public class DanhSachGD {
	private List<GiaoDich> ds;
	
	public DanhSachGD() {
		this.ds=new ArrayList<>();
	}
	
	public void themGD(GiaoDich a) {
		this.ds.add(a);
	}
	
	public void tinhTongSL() {
		long tong1=0, tong2=0;
		for (GiaoDich giaoDich : ds) {
			if(giaoDich instanceof Vang)
				tong1+=giaoDich.getSoLuong();
			else 
				tong2+=giaoDich.getSoLuong();
		}
		System.out.printf("So luong giao dich vang: %l, giao dich tien te: %l",tong1,tong2);
	}
	public double tinhTB() {
		double tong=0;
		int dem=0;
		for (GiaoDich giaoDich : ds) {
			if(giaoDich instanceof TienTe) {
				tong+=giaoDich.tinhThanhTien();
				dem++;
			}
		}
		return tong/dem;
	}
	public void xuatGD() {
		for (GiaoDich giaoDich : ds) {
			if(giaoDich.getDonGia()>1000000000)
				System.out.println(giaoDich);
		}
	}
}
