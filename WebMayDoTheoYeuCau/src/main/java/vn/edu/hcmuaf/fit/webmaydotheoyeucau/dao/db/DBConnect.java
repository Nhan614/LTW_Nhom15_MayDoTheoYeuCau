    package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.db;

    import com.mysql.cj.jdbc.MysqlDataSource;
    import org.jdbi.v3.core.Jdbi;

    import java.sql.SQLException;

    public class DBConnect {
        private static Jdbi jdbi;

        public static Jdbi get() {
            if (jdbi == null) connect();
            return jdbi;
        }

        public static void connect() {
            MysqlDataSource ds = new MysqlDataSource();
            ds.setURL("jdbc:mysql://" + DBProperties.host() + ":" + DBProperties.port() + "/" + DBProperties.dataName());
            ds.setUser(DBProperties.userName());
            ds.setPassword(DBProperties.password());
            try {
                ds.setAutoReconnect(true);
                ds.setUseCompression(true);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            jdbi = Jdbi.create(ds);
        }

        public static void main(String[] args) {
            try {
                Jdbi jdbi = DBConnect.get();
                System.out.println("Kết nối thành công!");
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Kết nối thất bại!");
            }
        }

    }
