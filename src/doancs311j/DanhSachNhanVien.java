
package doancs311j;


import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class DanhSachNhanVien {
     ArrayList<NhanVien> a=new ArrayList<>();   
    public  void docFile(String tenFile){
        try {
            File f= new File(tenFile);
            if (f.exists()) {
                Scanner read= new Scanner(f);
                while(read.hasNext()){
                    String ma,ten="",quocTich="";
                    boolean gt;
                    Date ngaySinh,ngayVaolam;
                 Scanner line =new Scanner(read.nextLine());
                 ma=line.next();
                 while(!line.hasNextBoolean())
                     ten = ten +line.next()+" ";
                 ten=ten.trim();
                 gt=line.nextBoolean();
                 ngayVaolam = new Date(line.next());
                 ngaySinh =new Date(line.next());
                 while(!line.hasNextLine())
                     quocTich+= line.next()+" ";
                 quocTich=quocTich.trim(); 
                    System.out.println(ten);
                if(ma.contains("CT"))
                        a.add(new CauThu(ma, ten, quocTich, gt, ngaySinh, ngayVaolam));
                else
                    a.add(new HuanLuyenVien(ma, ten, quocTich, gt, ngaySinh, ngayVaolam));
                }
                
            } else {
                System.out.println("Can't open file");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public  void themMoi(NhanVien nv){
        a.add(nv);
    }   
    public ArrayList<NhanVien> layDSNV(){
        return a;
    }
    public boolean xoaTheoMa(String maNV){ 
        for (NhanVien nv : a) {
            if (nv.getMaNV().equalsIgnoreCase(maNV)) {
                a.remove(nv);
                return true;
            }
        }
        return false;
    }
    public NhanVien timKiemTheoMa(String maNV){
        for (NhanVien nv : a) {
            if (nv.getMaNV().equalsIgnoreCase(maNV)) {
                return nv;
            }
        }
        return null;
    }
    public ArrayList<NhanVien> inDSCT(){
        ArrayList<NhanVien> dsCT=new ArrayList<>();
        for (NhanVien nv : a) {
            if (nv instanceof CauThu) {
                dsCT.add(nv);
            }
        }
        return dsCT;
                
    }
     public ArrayList<NhanVien> inDSHLV(){
        ArrayList<NhanVien> dsHLV=new ArrayList<>();
        for (NhanVien nv : a) {
            if (nv instanceof HuanLuyenVien) {
                dsHLV.add(nv);
            }
        }
        return dsHLV;
     }
    public ArrayList<NhanVien> layDSCTCBTT4(){
        ArrayList<NhanVien> dsMoi=new ArrayList<>();
        for (NhanVien nv : a) {
            if (nv instanceof CauThu) {
                if (((CauThu) nv).getBanThang()>=4) {
                    dsMoi.add(nv);
                }
              }
            }
            return dsMoi;
        }  
       
}

