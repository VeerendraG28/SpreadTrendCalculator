import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class WinnerPercentage {
	
    static final String spreadOne = "0.00";
    static final String spreadTwo = "0.50";
    static final String spreadThree = "1.00";
    static final String spreadFour = "1.50";
    static final String spreadFive = "2.00";
    static final String spreadSix = "2.50";
    static final String spreadSeven = "3.00";
    static final String spreadEight = "3.50";
    static final String spreadNine = "4.00";
    static final String spreadTen = "4.50";
    static final String spreadEleven = "5.00";
    static final String spreadTwelve = "5.50";
    static final String spreadThirteen = "6.00";
    static final String spreadFourteen = "6.50";
    static final String spreadFifteen = "7.00";
    static final String spreadSixteen = "7.50";
    static final String spreadSeventeen = "8.00";
    static final String spreadEighteen = "8.50";
    static final String spreadNineteen = "9.00";
    static final String spreadTwenty = "9.50";
    static final String spreadTwentyOne = "10.00";
    static final String spreadTwentyTwo = "10.50";
    static final String spreadTwentyThree = "11.00";
    static final String spreadTwentyFour = "11.50";
    static final String spreadTwentyFive = "12.00";
    static final String spreadTwentySix = "12.50";
    static final String spreadTwentySeven = "13.00";
    static final String spreadTwentyEight = "13.50";
    static final String spreadTwentyNine = "14.00";
    static final String spreadThirty = "14.50";
    static final String spreadThirtyOne = "15.00";
    static final String spreadThirtyTwo = "15.50";
    static final String spreadThirtyThree = "16.00";
    static final String spreadThirtyFour = "16.50";
    static final String spreadThirtyFive = "17.00";
    
    static final double percentageOne = 50.0;
    static final double percentageTwo = 50.0;
    static final double percentageThree = 51.3;
    static final double percentageFour = 52.5;
    static final double percentageFive = 53.5;
    static final double percentageSix = 54.5;
    static final double percentageSeven = 59.4;
    static final double percentageEight = 64.3;
    static final double percentageNine = 65.8;
    static final double percentageTen = 67.3;
    static final double percentageEleven = 68.1;
    static final double percentageTwelve = 69.0;
    static final double percentageThirteen = 70.7;
    static final double percentageFourteen = 72.4;
    static final double percentageFifteen = 75.2;
    static final double percentageSixteen = 78.1;
    static final double percentageSeventeen = 79.1;
    static final double percentageEighteen = 80.2;
    static final double percentageNineteen = 80.7;
    static final double percentageTwenty = 81.1;
    static final double percentageTwentyOne = 83.6;
    static final double percentageTwentyTwo = 86.0;
    static final double percentageTwentyThree = 87.1;
    static final double percentageTwentyFour = 88.2;
    static final double percentageTwentyFive = 88.5;
    static final double percentageTwentySix = 88.7;
    static final double percentageTwentySeven = 89.3;
    static final double percentageTwentyEight = 90.0;
    static final double percentageTwentyNine = 92.4;
    static final double percentageThirty = 94.9;
    static final double percentageThirtyOne = 95.6;
    static final double percentageThirtyTwo = 96.3;
    static final double percentageThirtyThree = 98.1;
    static final double percentageThirtyFour = 99.8;
    static final double percentageThirtyFive = 100.0;
    
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
      
      System.out.println("Who is the favorite team by their spread? (negative number)");
      String teamOne = input.next();
      System.out.println("What is underdog team by their spread? (positive number)");
      String teamTwo = input.next();
      System.out.println("What is spread for the underdog team? (positive spread input in the format 0.00)");
      String teamSpread = input.next();
      
      if (teamSpread.equals(spreadOne)) {
     	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageOne + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageOne) + "%.");
      }
      if (teamSpread.equals(spreadTwo)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageTwo + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageTwo) + "%.");
       }
      if (teamSpread.equals(spreadThree)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageThree + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageThree) + "%.");
       }
      if (teamSpread.equals(spreadFour)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageFour + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageFour) + "%.");
       }
      if (teamSpread.equals(spreadFive)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageFive + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageFive) + "%.");
       }
      if (teamSpread.equals(spreadSix)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageSix + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageSix) + "%.");	 
      	}
      if (teamSpread.equals(spreadSeven)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageSeven + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageSeven) + "%.");
       }
      if (teamSpread.equals(spreadEight)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageEight + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageEight) + "%.");
       }
      if (teamSpread.equals(spreadNine)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageNine + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageNine) + "%.");
       }
      if (teamSpread.equals(spreadTen)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageTen + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageTen) + "%.");
       }
      if (teamSpread.equals(spreadEleven)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageEleven + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageEleven) + "%.");
       }
      if (teamSpread.equals(spreadTwelve)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageTwelve + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageTwelve) + "%.");
       }
      if (teamSpread.equals(spreadThirteen)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageThirteen + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageThirteen) + "%.");
       }
      if (teamSpread.equals(spreadFourteen)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageFourteen + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageFourteen) + "%.");
       }
      if (teamSpread.equals(spreadFifteen)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageFifteen + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageFifteen) + "%.");
       }
      if (teamSpread.equals(spreadSixteen)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageSixteen + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageSixteen) + "%.");
       }
      if (teamSpread.equals(spreadSeventeen)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageSeventeen + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageSeventeen) + "%.");
       }
      if (teamSpread.equals(spreadEighteen)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageEighteen + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageEighteen) + "%.");
       }
      if (teamSpread.equals(spreadNineteen)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageNineteen + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageNineteen) + "%.");
       }
      if (teamSpread.equals(spreadTwenty)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageTwenty + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageTwenty) + "%.");
       }
      if (teamSpread.equals(spreadTwentyOne)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageTwentyOne + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageTwentyOne) + "%.");
       }
      if (teamSpread.equals(spreadTwentyTwo)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageTwentyTwo + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageTwentyTwo) + "%.");
       }
      if (teamSpread.equals(spreadTwentyThree)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageTwentyThree + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageTwentyThree) + "%.");
       }
      if (teamSpread.equals(spreadTwentyFour)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageTwentyFour + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageTwentyFour) + "%.");
       }
      if (teamSpread.equals(spreadTwentyFive)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageTwentyFive + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageTwentyFive) + "%.");
       }
      if (teamSpread.equals(spreadTwentySix)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageTwentySix + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageTwentySix) + "%.");
       }
      if (teamSpread.equals(spreadTwentySeven)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageTwentySeven + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageTwentySeven) + "%.");
       }
      if (teamSpread.equals(spreadTwentyEight)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageTwentyEight + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageTwentyEight) + "%.");
       }
      if (teamSpread.equals(spreadTwentyNine)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageTwentyNine + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageTwentyNine) + "%.");
       }
      if (teamSpread.equals(spreadThirty)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageThirty + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageThirty) + "%.");
       }
      if (teamSpread.equals(spreadThirtyOne)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageThirtyOne + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageThirtyOne) + "%.");
       }
      if (teamSpread.equals(spreadThirtyTwo)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageThirtyTwo + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageThirtyTwo) + "%.");
       }
      if (teamSpread.equals(spreadThirtyThree)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageThirtyThree + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageThirtyThree) + "%.");
       }
      if (teamSpread.equals(spreadThirtyFour)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageThirtyFour + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageThirtyFour) + "%.");
       }
      if (teamSpread.equals(spreadThirtyFive)) {
      	 System.out.println("The percentage for the " + teamOne + " to win is " + percentageThirtyFive + "%. The percentage for the " + teamTwo + " to win is " + (100-percentageThirtyFive) + "%.");
       }
     
      // close JDBC connection
      st.close();
      con.close();
      input.close();

   } 
}