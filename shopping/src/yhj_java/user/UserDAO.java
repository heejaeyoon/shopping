package yhj_java.user;

import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class UserDAO {
	private Connection con = getConnect();
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	private Connection getConnect() {
		try {
			Properties prop = new Properties();
			String path = UserDAO.class.getResource("db.properties").getPath();
			path = URLDecoder.decode(path, "utf-8");
			prop.load(new FileReader(path));
			String driver = prop.getProperty("driver");
			Class.forName(driver);
			String url = prop.getProperty("url");
			String user = prop.getProperty("user");
			String pw = prop.getProperty("pw");
			Connection con = DriverManager.getConnection(url, user, pw);
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("DB연결 실패");
		return null;
	}

	
	
	public ArrayList<User> getMemberList() {
		ArrayList<User> memberList = new ArrayList<User>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		User user = null;

		try {
			String sql = "SELECT * FROM MEMBER";

			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				user = new User();
				user.setUserId(rs.getString("id"));
				user.setUserPw(rs.getString("pw"));
				user.setUserName(rs.getString("name"));
				user.setUserEmail(rs.getString("email"));
				user.setUserPhone(rs.getString("phone"));
				user.setUserPostcode(rs.getString("postcode"));
				user.setUserAdd(rs.getString("add"));
				user.setUserDetailAdd(rs.getString("detailadd"));
				user.setUserGender(rs.getString("gender"));
				user.setUserBirth(rs.getString("birth"));
				user.setUserPoint(rs.getInt("point"));
				memberList.add(user);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return memberList;

	}

	public int login(String userId, String userPw) {
		String sql = "select userPw from member where userId = ?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (rs.getString(1).equals(userPw)) {
					return 1; // 로그인 성공
				} else {
					return 0; // 비밀번호 불일치
				}
			}
			return -1; // 아이디가 없다
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -2; // 데이터베이스 오류
	}

	public int register(User user) {
		String sql = "insert into member values (member_seq.nextval,?,?,?,?,?,?,?,?,?,?,sysdate,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUserId());
			pstmt.setString(2, user.getUserPw());
			pstmt.setString(3, user.getUserName());
			pstmt.setString(4, user.getUserEmail());
			pstmt.setString(5, user.getUserPhone());
			pstmt.setString(6, user.getUserPostcode());
			pstmt.setString(7, user.getUserAdd());
			pstmt.setString(8, user.getUserDetailAdd());
			pstmt.setString(9, user.getUserGender());
			pstmt.setString(10, user.getUserBirth());
			pstmt.setInt(11, user.getUserPoint());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;// 데이터 베이스 오류
	}

	public boolean idcheck(String id) {

		boolean flag = false;
		System.out.println("모얌" + id);

		String sql = "select userid from member where userid=?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				flag = true;
			}

		} catch (SQLException e) {
			System.out.println("idcheck sql error");
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.out.println("데이터 오류");
			}
		}

		System.out.println("flag :" + flag);
		return flag;

	}

	// 아이디 찾기
	public String findId(String userName, String userPhone) {
		System.out.println("userName >>> " + userName);
		System.out.println("userPhone >>> " + userPhone);
		String id = null;

		try {
			String sql = "select userId from member where userName=? and userPhone=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userName);
			pstmt.setString(2, userPhone);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println("****여기까지옴****");
				id = rs.getString("userId");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return id;
	}

	public String findPw(String userId, String userPhone) {
		String pwd = null;
		try {
			String sql = "select userPw from member where userId=? and userPhone=? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPhone);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				pwd = rs.getString("userPw");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return pwd;
	}

}
