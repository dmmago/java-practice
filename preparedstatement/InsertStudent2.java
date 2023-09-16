import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class InsertStudent2 {
  public static void main (String[] args) {
    final String URL = "jdbc:mysql://localhost/sampledb";
    final String USER = "root";
    final String PASS = "pass";
    String sql = "INSERT INTO student VALUES(?, ?, ?)";
    String[] names = {"藤原", "草野", "豊田", "小橋"};
    int[] scores = {90, 70, 60, 75};

    Connection con = null;
    PreparedStatement ps = null;

    try {
      con = DriverManager.getConnection(URL, USER, PASS);
      ps = con.prepareStatement(sql);
      for(int i = 0; i < names.length; i++) {
      ps.setInt(1, i + 7);
      ps.setString(2, names[i]);
      ps.setInt(3, scores[i]);
      ps.executeUpdate();
      }
      System.out.println( names.length + "件更新しました");
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      try{
        if(ps != null) ps.close();
        if(con != null) con.close();
      } catch(Exception e) {
        e.printStackTrace();
      }
    }

  }
  
}
