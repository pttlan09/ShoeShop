package javabeans;

import java.io.Serializable;
import java.sql.Date;

public class QuangCao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 private int id;
	 private String hinhAnh;
	 private String thongDiep;
	 private String thongTinChiTiet;
	 private Date ngayDang;
	public QuangCao() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public String getThongDiep() {
		return thongDiep;
	}
	public void setThongDiep(String thongDiep) {
		this.thongDiep = thongDiep;
	}
	public String getThongTinChiTiet() {
		return thongTinChiTiet;
	}
	public void setThongTinChiTiet(String thongTinChiTiet) {
		this.thongTinChiTiet = thongTinChiTiet;
	}
	public Date getNgayDang() {
		return ngayDang;
	}
	public void setNgayDang(Date ngayDang) {
		this.ngayDang = ngayDang;
	}

	 

}
