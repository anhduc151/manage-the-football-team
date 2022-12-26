package doancs311j;

import java.util.Date;

public class CauThu extends NhanVien{
	// properties:
	private String viTriThiDau;
	private int soLuotTranThamGia;
	private int banThang;
	private double luongThoaThuan;
	
	// constructors:
	public CauThu(){}

    public CauThu(String viTriThiDau, int soLuotTranThamGia, int banThang, double luongThoaThuan, String maNV, String ten, String quocTich, boolean gioiTinh, Date ngaySinh, Date ngayVaoLam) {
        super(maNV, ten, quocTich, gioiTinh, ngaySinh, ngayVaoLam);
        this.viTriThiDau = viTriThiDau;
        this.soLuotTranThamGia = soLuotTranThamGia;
        this.banThang = banThang;
        this.luongThoaThuan = luongThoaThuan;
    }
    public CauThu(String maNV, String ten, String quocTich, boolean gioiTinh, Date ngaySinh, Date ngayVaoLam) {
        super(maNV, ten, quocTich, gioiTinh, ngaySinh, ngayVaoLam);
        this.viTriThiDau = "";
        this.soLuotTranThamGia = 0;
        this.banThang = 0;
        this.luongThoaThuan = 0;
    }
	
	// get and set:
	public String getViTriThiDau() {
		return viTriThiDau;
	}
	public void setViTriThiDau(String viTriThiDau) {
		this.viTriThiDau = viTriThiDau;
	}
	public int getSoLuotTranThamGia() {
		return soLuotTranThamGia;
	}
	public void setSoLuotTranThamGia(int soLuotTranThamGia) {
		this.soLuotTranThamGia = soLuotTranThamGia;
	}
	public int getBanThang() {
		return banThang;
	}
	public void setBanThang(int banThang) {
		this.banThang = banThang;
	}
	public double getLuongThoaThuan() {
		return luongThoaThuan;
	}
	public void setLuongThoaThuan(double luongThoaThuan) {
		this.luongThoaThuan = luongThoaThuan;
	}

    @Override
    public double tinhLuong() {
         if (banThang>5) {
            return luongThoaThuan*PHU_CAP_MOT_NAM*1.5;
        } else {
            return luongThoaThuan*PHU_CAP_MOT_NAM;
        }
    }

}   	