import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Connection conn = SQLServerConnector.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "select * from accumulate_points_DB_user";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("no:" + rs.getInt("no") + ",name:"+ rs.getString("real_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
	}

}
