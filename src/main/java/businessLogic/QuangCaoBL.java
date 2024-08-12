package businessLogic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import javabeans.QuangCao;

public class QuangCaoBL {
	public static List<QuangCao> getAll() {
		List<QuangCao> dsqc = new ArrayList<QuangCao>();
		String sql = "select * from quangcao";
		try (Connection conn = CSDL.getKetNoi()) {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				QuangCao qc = new QuangCao();
				qc.setId(rs.getInt("id"));
				qc.setHinhAnh(rs.getString("hinhanh"));
				qc.setThongDiep(rs.getString("thongdiep"));
				qc.setThongTinChiTiet(rs.getString("thongtinchitiet"));
				qc.setNgayDang(rs.getDate("ngaydang"));
				dsqc.add(qc);
			}
			return dsqc;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static int add(QuangCao qc) throws SQLException {
		String sql = "insert into quangcao values(?,?,?,?,?)";
		try (Connection conn = CSDL.getKetNoi()) {
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
			pst.setInt(1, qc.getId());
		}
		return 0;

	}

	public static void main(String[] args) {
		List<QuangCao> dsqc = getAll();
		dsqc.forEach(ds -> System.out.println(ds.getThongDiep()));

		// THEM
		// QuangCao qc1=QuangCaoBL.them(0,"lan.png","lanne","laneeee",)
	}

}
