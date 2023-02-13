package myapp.config;

import java.sql.Connection;
import java.sql.DriverManager;

// import com.mysql.cj.protocol.Resultset;
// import com.mysql.cj.xdevapi.Statement;

public class DBConfig {

    public static Connection getConnection() {
        try {
            // Class.forName new 해주는 것 (드라이버 로딩)
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/metadb", "root", "1234");
            System.out.println("DB연결성공");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // public static void main(String[] args) {
    // try {
    // Connection conn = DBConfig.getConnection();
    // Statement resultSet = (Statement) conn.createStatement().executeQuery("select
    // * from product");

    // } catch (Exception e) {
    // // TODO: handle exception
    // }
    // }
}
