package model;
import java.util.List;
public class SinhVien {
    private String masv;
    private String ten;
    private BangDiem bangDiem;

    public SinhVien(String masv, String ten, BangDiem bangDiem) {
        this.ten = ten;
        this.masv = masv;
        this.bangDiem = bangDiem;
    }

    //Xem ky dinh nghia giong nhau
    public boolean equals(Object that){
        if(that == null) return false;
        if (!(that instanceof SinhVien))
            return false;
        SinhVien thatSinhVien = (SinhVien) that;
        return this.ten.equals(thatSinhVien.ten) && this.masv.equals(thatSinhVien.masv);
    }

    public boolean kiemTraQua (MonHoc monHoc) {
    	return bangDiem.getDsDiem().stream()
				.anyMatch(t -> ((t.getMonHoc().equals(monHoc)) && (t.getDiemCuoiCung()>=4)));
    }
    
    public String getMasv() {
		return masv;
	}

	public void setMasv(String masv) {
		this.masv = masv;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public void setBangDiem(BangDiem bangDiem) {
		this.bangDiem = bangDiem;
	}
    //
    //Cau 1 : Sinh vien chi co the dang ky hoc 1 mon hoc khi
    //- Mon hoc do nam trong chuong trinh.
    //- Sinh vien phai chua dau mon hoc do
    //- Phai dau tat ca cac mon tien quyet cua mon hoc do.
    //Chu y:
    //   Mon hoc co nhieu diem diem cua mon do la diem cuoi cung
    //   Doc yeu cau that ky nha neu ko thoa thi ko co diem dau do
    public boolean coTheDangKyHoc(MonHoc monHoc) {
    	if(!ChuongTrinhHoc.SINGLETON.getListMonHoc().stream().anyMatch(t->t.equals(monHoc)))return false;
    	if(kiemTraQua(monHoc)) return false;
    	if(monHoc.getDsMonTienQuyet().stream().anyMatch(t->!kiemTraQua(t))) return false;
        return true;
    }

    public BangDiem getBangDiem() {
        return bangDiem;
    }
}
