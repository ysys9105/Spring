package exam_01_composition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BookDAO {
	public ArrayList<BookEntity> selectAll(String keyword) {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	ArrayList<BookEntity> list = null;
	
	try {
		//1.Driver Loading
		Class.forName("com.mysql.jdbc.Driver");
		
		//2. DB-Access
		String url = "jdbc:mysql://localhost:3306/library";
		String id = "jquery";
		String pw = "jquery";
		con = DriverManager.getConnection(url,id,pw);
		
		//3. PreparedStatement 생성(SQL을 가지고 있는)
		String sql = "select bisbn,btitle,bauthor from book where btitle like ?";
		
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, "%"+keyword+"%");
		//4. Query EXECUTE!!
		rs = pstmt.executeQuery();
		//insert,update,delete일 경우
		//pstmt.executeUpdate();
		
		//5. 결과처리
		//DB에서 들고온 데이터를 ArrayList<BookEntity>형태로 생성
		list = new ArrayList<BookEntity>();
		while(rs.next()){
			BookEntity entity = new BookEntity();
			entity.setBisbn(rs.getString("bisbn"));
			entity.setBtitle(rs.getString("btitle"));
			entity.setBauthor(rs.getString("bauthor"));
			list.add(entity);
		}
			
	} catch (Exception e) {
		System.out.println(e);
	} finally{
		try{
			rs.close();
			pstmt.close();
			con.close();
		}catch (Exception e){
			
		}
	}
	
	return list;
}

}
