import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TeamSchedule {
	
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
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("What team's data would you like to retrive? Note: input as teamname_spread");
      String team1 = input.next();
      
      //String query = "SELECT * FROM " + team1 + " WHERE RESULT = \'PANTHERS\'";
      //String queryTwo = "SELECT * FROM " + team2 + " WHERE RESULT = \'CARDINALS\'";
      
      String query = "SELECT * FROM " + team1;
      
      ResultSet rs = st.executeQuery(query);
      //ResultSet rsTwo = st.executeQuery(queryTwo);
           
      // process the ResultSet object
      boolean flag = false;
            
      while (rs.next()) {
         flag = true;
                  
         System.out.println("Week: " + rs.getString(1) + " Opponent: " + rs.getString(2) + 
                  " Spread: " + rs.getString(3) + " Winner: " + rs.getString(4) + " Score: " + rs.getString(5));;
         
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
      input.close();

   } 
}