
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestUserDAO {
public void selectByPassword(String password){
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();

	String sql="select * from test_table where password=?";
	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, password);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
		System.out.println(rs.getString("user_name"));
		System.out.println(rs.getString("password"));
		}
	}catch (SQLException e){
	       e.printStackTrace();
}
    try{
	con.close();
    }catch (SQLException e){
    	e.printStackTrace();
    }
}
}

