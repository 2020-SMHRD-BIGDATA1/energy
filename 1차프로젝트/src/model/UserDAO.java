package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;

	private void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void close() {
		try {
			if (pst != null) {
				pst.close();
			}
			if (conn != null) {
				conn.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int findId(String id) {

		int cnt = 0;

		getConnection();

		try {

			String sql = "select * from users where id = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);

			rs = pst.executeQuery();

			if (rs.next()) {
				cnt = 0;
			} else {
				cnt = 1;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}

	public int insertUser(UserVO joinUser) {

		int cnt = 0;

		getConnection();

		try {

			String sql = "insert into users values(?, ?, ?, ?, ?, ?)";
			pst = conn.prepareStatement(sql);
			pst.setString(1, joinUser.getId());
			pst.setString(2, joinUser.getPw());
			pst.setString(3, joinUser.getName());
			pst.setInt(4, joinUser.getAge());
			pst.setString(5, joinUser.getAddr());
			pst.setString(6, joinUser.getPhone());

			cnt = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}

	public UserVO selectOne(UserVO user) {
		UserVO loginUser = null;

		getConnection();

		try {
			String sql = "SELECT * FROM users WHERE ID=? AND PW =? ";
			pst = conn.prepareStatement(sql);
			pst.setString(1, user.getId());
			pst.setString(2, user.getPw());
			rs = pst.executeQuery();

			if (rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				loginUser = new UserVO(id, pw, name);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return loginUser;
	}

	public int delete(String deleteUser) {
		int cnt = 0;
		getConnection();
		try {
			String sql = "DELETE FROM users WHERE id =?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, deleteUser);
			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		if (cnt > 0) {
			return cnt;
		}
		return cnt;
	}

	public int Change(UserVO change) {

		int cnt = 0;

		getConnection();

		try {

			String sql = "update users set pw = ?, phone = ?, addr = ? where id = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, change.getPw());
			pst.setString(2, change.getPhone());
			pst.setString(3, change.getAddr());
			pst.setString(4, change.getId());

			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return cnt;

	}
}
