package businessLogic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javabeans.ThuongHieu;

public class ThuongHieuBL {
	public static List<ThuongHieu> getAll() {
		List<ThuongHieu> dsth = new ArrayList<ThuongHieu>();
		String sql = "select * from thuonghieu";
		try (Connection conn = CSDL.getKetNoi()) {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				ThuongHieu th = new ThuongHieu();
				th.setId(rs.getInt("id"));
				th.setTenThuongHieu(rs.getString("tenthuonghieu"));
				th.setHinhAnh(rs.getString("hinhanh"));
				dsth.add(th);
			}
			return dsth;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
//	public static void main(String[] args) {
//		List<ThuongHieu> dsth=getAll();
//		dsth.forEach(th->System.out.println(th.getTenThuongHieu()));
//	}
}
