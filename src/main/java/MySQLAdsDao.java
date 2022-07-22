import java.sql.*;
import com.mysql.cj.jdbc.Driver;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    @Override
    public List<Ad> all() {
       List<Ad> newAdsList = new ArrayList<>();
       PreparedStatement smt = null;
       try {
           smt = connection.prepareStatement("SELECT * FROM ads");
           ResultSet rs = smt.executeQuery();
           while(rs.next()) {
               newAdsList.add(new Ad(
                       rs.getLong("id"),
                       rs.getLong("user_id"),
                       rs.getString("title"),
                       rs.getString("description")
               ));
           }
           return newAdsList;
       } catch (SQLException e) {
           throw new RuntimeException("Error Connecting to Database", e);
       }
    }

    @Override
    public Long insert(Ad ad) {
        String title = ad.getTitle();
        String desc = ad.getDescription();
        String query = "INSERT INTO ads(user_id, title, description) VALUES(1, '"+title+"', '"+desc+"')";
        try {
            Statement smt = connection.createStatement();
            smt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = smt.getGeneratedKeys();
            rs.next();
            System.out.println("Created a new ad, id of the ad: " + rs.getLong(1));
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error Connecting to Database", e);
        }
    }

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword());
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException("Error Connecting to Database", e);
        }
    }
}
