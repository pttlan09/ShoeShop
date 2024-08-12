package javabeans;

import java.io.Serializable;

public class NguoiDung implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String email;
	private String passWord;
	private String hoTen;
	private String diaChi;
	private String dTDD;
	private int idVaitro;

	public NguoiDung() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getdTDD() {
		return dTDD;
	}

	public void setdTDD(String dTDD) {
		this.dTDD = dTDD;
	}

	public int getIdVaitro() {
		return idVaitro;
	}

	public void setIdVaitro(int idVaitro) {
		this.idVaitro = idVaitro;
	}

}
