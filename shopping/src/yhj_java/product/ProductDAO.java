package yhj_java.product;

import java.io.FileReader;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;



public class ProductDAO {
	private static ProductDAO productDAO = new ProductDAO();
	
	private ProductDAO() {
		
	}
	
	public static ProductDAO getInstance() {
		return productDAO;
	}
	
	private Connection con = getConnect();
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private Connection getConnect() {
		try {
			Properties prop = new Properties();
			String path = ProductDAO.class.getResource("db.properties").getPath();
			path = URLDecoder.decode(path, "utf-8");
			prop.load(new FileReader(path));
			String driver = prop.getProperty("driver");
			Class.forName(driver);
			String url = prop.getProperty("url");
			String user = prop.getProperty("user");
			String pw = prop.getProperty("pw");
			Connection con = DriverManager.getConnection(url, user, pw);
			System.out.println("DB연결성공!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("DB연결 실패");
		return null;
	}

//	public List<ProductVo> selectAllProducts() {
//		String sql = "select * from product order by code desc";
//		List<ProductVo> list = new ArrayList<ProductVo>();
//
//		try {
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			while (rs.next()) {
//				ProductVo vo = new ProductVo();
//				vo.setCode(rs.getInt("code"));
//				vo.setName(rs.getString("name"));
//				vo.setPrice(rs.getInt("price"));
//				vo.setPictureUrl(rs.getString("pictureUrl"));
//				vo.setDescription(rs.getString("description"));
//				list.add(vo);
//			}
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return list;
//
//	}

	public int insertProduct(ProductVo vo) {
		String sql = "INSERT INTO PRODUCT2 VALUES (PRODUCT2_SEQ.nextval,?,?,?,?,?)";
		System.out.println("***********************");
		System.out.println(vo);
		System.out.println("***********************");
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getPcode());
			pstmt.setString(2, vo.getPname());			
			pstmt.setString(3, vo.getPetc());			
			pstmt.setString(4, vo.getPdates());			
			pstmt.setString(5, vo.getPimg());			
			return  pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}

//	public ProductVo selectProductByCode(String code) {
//		String sql = "select * from product where code=?";
//		ProductVo vo = null;
//		try {
//			pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, code);
//			rs = pstmt.executeQuery();
//			if (rs.next()) {
//				vo = new ProductVo();
//				vo.setCode(rs.getInt("code"));
//				vo.setName(rs.getString("name"));
//				vo.setPrice(rs.getInt("price"));
//				vo.setPictureUrl(rs.getString("pictureUrl"));
//				vo.setDescription(rs.getString("description"));
//			}
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return vo;
//	}
//
//	public void updateProduct(ProductVo vo) {
//		String sql = "update product set name=?,price=?,pictureUrl=?,description = ? where code=?";
//		try {
//			pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, vo.getName());
//			pstmt.setInt(2, vo.getPrice());
//			pstmt.setString(3, vo.getPictureUrl());
//			pstmt.setString(4, vo.getDescription());
//			pstmt.setInt(5, vo.getCode());
//			pstmt.executeUpdate();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch blocks
//			e.printStackTrace();
//		}
//	}

//	public void deleteProduct(String code) {
//		String sql = "update product where code=?";
//		try {
//			pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, code);
//			pstmt.executeUpdate();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
