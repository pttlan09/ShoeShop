package javabeans;

public class SanPhamMua extends SanPham{
	private int soLuongMua;

	public SanPhamMua() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSoLuongMua() {
		return soLuongMua;
	}

	public void setSoLuongMua(int soLuongMua) {
		this.soLuongMua = soLuongMua;
	}
	public double thanhTien() {
		return soLuongMua*getDonGiaKM(); 
	}

}
