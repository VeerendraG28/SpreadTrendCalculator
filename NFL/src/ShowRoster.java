
import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowRoster {
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
      System.out.println("What team's roster would you like to see? Note: Please enter in the format city_teamname!");
      String team = input.next();
      
      String query = "SELECT * FROM " + team;
      
      ResultSet rs = st.executeQuery(query);
           
      // process the ResultSet object
      boolean flag = false;
      while (rs.next()) {
         flag = true;
         System.out.println("Player name: " + rs.getString(1) + " Position: " + rs.getString(2) + 
                  " Age: " + rs.getString(3) + " Number: " + rs.getString(4));
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