package day60.model.dao;

import day60.model.dto.WaitingDto;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

@Component
public class WaitingDao {

        private Connection conn;
        private String DBURL = "jdbc:mysql://localhost:3306/mydb0110";
        private String DBUSER = "root";
        private String DBPWD = "1234";

        public WaitingDao(){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
            } catch ( Exception e ) {
                throw new RuntimeException(e);
            }
        }

    public boolean signUp(WaitingDto waitingDto){
 try {
    String sql = "insert into waiting (wphone,wpeople) values(?,?)";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1,waitingDto.getWphone());
    ps.setInt(2,waitingDto.getWpeople());
    int c = ps.executeUpdate();
    if (c == 1) {return true;}
} catch (Exception e) {
    throw new RuntimeException(e);
}return false;}

    public ArrayList<WaitingDto>list(){
      ArrayList<WaitingDto>list=new ArrayList<>();
try {

    String sql = "select*from waiting";
    PreparedStatement ps = conn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();

    while (rs.next()) {
        WaitingDto waitingDto = new WaitingDto(
                rs.getInt("wno"),
                rs.getString("wphone"),
                rs.getInt("wpeople"));
        list.add(waitingDto);
    }

} catch (Exception e) {
    throw new RuntimeException(e);
} return list;



    }









}
