package doancs311j;

import java.util.Date;

public class HuanLuyenVien extends NhanVien {
	
	//properties:
	private int soNamKinhNghiem;
	private double heSoLuong;
	private double phuCap;
	
	// constructors:
	public HuanLuyenVien(){}

    public HuanLuyenVien(int soNamKinhNghiem, double heSoLuong, double phuCap, String maNV, String ten, String quocTich, boolean gioiTinh, Date ngaySinh, Date ngayVaoLam) {
        super(maNV, ten, quocTich, gioiTinh, ngaySinh, ngayVaoLam);
        this.soNamKinhNghiem = soNamKinhNghiem;
        this.heSoLuong = heSoLuong;
        this.phuCap = phuCap;
    }
    public HuanLuyenVien(String maNV, String ten, String quocTich, boolean gioiTinh, Date ngaySinh, Date ngayVaoLam) {
        super(maNV, ten, quocTich, gioiTinh, ngaySinh, ngayVaoLam);
        this.soNamKinhNghiem = 0;
        this.heSoLuong = 0;
        this.phuCap =0;
    }	
	
	public int getSoNamKinhNghiem() {
		return soNamKinhNghiem;
	}
	public void setSoNamKinhNghiem(int soNamKinhNghiem) {
		this.soNamKinhNghiem = soNamKinhNghiem;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public double getPhuCap() {
		return phuCap;
	}
	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}
	
	
        @Override
	public double tinhLuong(){
		return (this.heSoLuong * 1050000) + this.phuCap + super.tinhPhuCapThamNien();
	}
}
