package simplejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AgentJdbc {

	public static void main(String args[]) {

		List<Agent> list = new ArrayList<Agent>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBHib", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Agent");
			while (rs.next()) {
				list.add(new Agent(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
			}
			
			System.out.println("---------- List of Agents --------------------");
			
			for (Agent agent : list) {
				System.out.println(agent);
			}
			
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
