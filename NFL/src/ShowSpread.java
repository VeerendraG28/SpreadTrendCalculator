
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowSpread {
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
      
      String query = "SELECT * FROM panthers_spread";
      
      ResultSet rs = st.executeQuery(query);
           
      // process the ResultSet object
      boolean flag = false;
      while (rs.next()) {
         flag = true;
         System.out.println(" Week: " + rs.getInt(1) + " Opponent: " + rs.getString(2) + 
                 " Spread: " + rs.getInt(3) + " Result: " + rs.getString(4) + " Score: " + rs.getString(5) + " MetSpread: " + rs.getInt(6));
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