package businessLogic;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.security.KeyStoreUtil;

import javabeans.SanPham;

public class SanPhamBL {
	public static List<SanPham> taoDanhSach(String sql) {
		List<SanPham> dssp = null;
		try (Connection conn = CSDL.getKetNoi()) {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			dssp = new ArrayList<SanPham>();
			while (rs.next()) {
				SanPham sp = new SanPham();
				sp.setId(rs.getInt("id"));
				sp.setTenSanPham(rs.getString("tensanpham"));
				sp.setMoTa(rs.getString("mota"));
				sp.setHinhAnh(rs.getString("hinhanh"));
				sp.setDonGia(rs.getDouble("dongia"));
				sp.setDonGiaKM(rs.getDouble("dongiaKM"));
				sp.setSoLuong(rs.getInt("soluong"));
				sp.setNgayTao(rs.getDate("ngaytao"));
				sp.setHienThi(rs.getString("hienthi"));
				sp.setIdLoai(rs.getInt("id_loai"));
				sp.setIdThuongHieu(rs.getInt("id_thuonghieu"));
				dssp.add(sp);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dssp;
	}

	public static SanPham docTheoID(int idSanPham) {
		String sql = "select * from sanpham where id=" + idSanPham;
		List<SanPham> dssp = taoDanhSach(sql);
		if (dssp.size() > 0)
			return dssp.get(0);
		else
			return null;
	}

	public static List<SanPham> getAll() {
		String sql = "select * from sanpham";
		List<SanPham> dssp = taoDanhSach(sql);
		return dssp;
	}

	public static List<SanPham> getNewSp(int top) {
		String sql = "select * from sanpham order by ngaytao desc limit 0," + top;
		List<SanPham> dssp = taoDanhSach(sql);
		return dssp;
	}

	public static List<SanPham> getfavoritelist(int top) {
		String sql = "select sp.*, sum(ct.soluong) as sum from sanpham sp inner join chitietdonhang ct "
				+ " on sp.id=ct.id_sanpham group by 1 order by sum desc limit 0," + top;
		List<SanPham> dssp = taoDanhSach(sql);
		return dssp;

	}
	public static List<SanPham> banChayNhat(int top)
	{
		String sql="select s.*,sum(c.soluong) as tslb from sanpham s inner join chitietdonhang c"
				+" on c.id_sanpham=s.id group by 1 order by tslb desc limit 0,"+top;
		List<SanPham> dssp=taoDanhSach(sql);
		return dssp;
	}
	public static void main(String[] args) {
//		List<SanPham> dssp = getAll();
//		dssp.forEach(ds -> System.out.println(ds.getTenSanPham()));
//get list product top 10
		List<SanPham> dssp1 = getNewSp(10);
		dssp1.forEach(ds -> System.out.println(ds.getTenSanPham()));

		
		//get list product favorite top 5
		List<SanPham> dssp2 = getfavoritelist(5);
		dssp2.forEach(ds -> System.out.println(ds.getTenSanPham()));
	}
}
