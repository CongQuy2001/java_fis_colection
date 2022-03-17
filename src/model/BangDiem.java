package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BangDiem {
    private List<Diem> dsDiem = new ArrayList<Diem>();

    public void themDiem(Diem diem){
        this.dsDiem.add(diem);
    }

    public BangDiem() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    public List<Diem> getDsDiem() {
		return dsDiem;
	}

	public void setDsDiem(List<Diem> dsDiem) {
		this.dsDiem = dsDiem;
	}
	
	
}
