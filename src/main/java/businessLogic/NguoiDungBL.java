package businessLogic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javabeans.NguoiDung;

public class NguoiDungBL {

	public static NguoiDung docTheoEmailPassword(String email,String password)
	{
		NguoiDung nd=null;
		String sql="select * from nguoidung where email='"+email+"'and password='"+password+"'";
		try(Connection conn=CSDL.getKetNoi())
		{
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			if(rs.next())
			{
				nd=new NguoiDung();
				nd.setId(rs.getInt("id"));
				nd.setEmail(rs.getString("email"));
				nd.setPassWord(rs.getString("password"));
				nd.setHoTen(rs.getString("hoten"));
				nd.setDiaChi(rs.getString("diachi"));
				nd.setdTDD(rs.getString("dtdd"));
				nd.setIdVaitro(rs.getInt("id_vaitro"));
			}
			return nd;
		} catch (SQLException e) {
			
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String[] args) {
		NguoiDung nd=docTheoEmailPassword("bichle@gmail.com", "bichle");
		if(nd!=null)
		{
			System.out.println("có người dùng: "+nd.getHoTen());
		}
		else
		{
			System.out.println("Không có user này");
		}
	}
}
