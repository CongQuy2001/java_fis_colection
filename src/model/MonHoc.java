package model;

import java.util.ArrayList;
import java.util.List;

public class MonHoc {
    private String ma;
    private String ten;
    private int soTclt;
    private int soTcth;
    //Mon hoc tien quyet la mon bat buoc phai dau
    private List<MonHoc> dsMonTienQuyet = new ArrayList<MonHoc>();

    public MonHoc(String maMH, String tenMH, int soTclt, int soTcth) {
        this.ma = maMH;
        this.ten = tenMH;
        this.soTclt = soTclt;
        this.soTcth = soTcth;
    }

    //Xem ky dinh nghia giong nhau
    public boolean equals(Object that){
        if(that == null) return false;
        if(! (that instanceof MonHoc) ) return false;
        MonHoc thatMonHoc = (MonHoc)that;
        return this.ma.equals(thatMonHoc.ma);
    }
    public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getSoTclt() {
		return soTclt;
	}

	public void setSoTclt(int soTclt) {
		this.soTclt = soTclt;
	}

	public int getSoTcth() {
		return soTcth;
	}

	public void setSoTcth(int soTcth) {
		this.soTcth = soTcth;
	}

	public void setDsMonTienQuyet(List<MonHoc> dsMonTienQuyet) {
		this.dsMonTienQuyet = dsMonTienQuyet;
	}

    public void addMonTienQuyet(MonHoc monTienQuyet) {
        this.dsMonTienQuyet.add(monTienQuyet);
    }

    public List<MonHoc> getDsMonTienQuyet() {
        return dsMonTienQuyet;
    }

	



}
