
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class NFLDivisions {
   public static void main(String[] args) throws Exception {
	   
	   try {
		    Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		} 

      // variables
      final String url = "jdbc:mysql://localhost:3306/nflteams";
      final String user = "root";
      final String password = "&mercuRy15";
      
     
      // establish the connection
      Connection con = DriverManager.getConnection(url, user, password);
      
      Statement st = con.createStatement();
      
      String query = "SELECT * FROM nfl_divisions";
      
      ResultSet rs = st.executeQuery(query);
           
      // process the ResultSet object
      boolean flag = false;
      while (rs.next()) {
         flag = true;
         System.out.println("Division: " + rs.getString(1) + " Team 1: " + rs.getString(2) + 
                  " Team 2: " + rs.getString(3) + " Team 3: " + rs.getString(4) + " Team 4: " + rs.getString(5));
      }

      if (flag == true) {
         System.out.println("\nRecords retrieved and displayed");
      } else {
         System.out.println("Record not found");
      }

      // close JDBC connection
      rs.close();
      st.close();
      con.close();

   } 
}