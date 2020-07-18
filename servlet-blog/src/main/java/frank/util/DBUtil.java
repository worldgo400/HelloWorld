package frank.util;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
    public static final String URL="jdbc:mysql://localhost:3306:blogdemo";
    public static final String  USERNAME="root";
    public static final String  PASSWORD="root";

    private static volatile DataSource DATA_SOURCE;

    private DBUtil(){}

    //获取数据库连接池：使用双层校验锁的单例模式创建数据库连接池
    //对外不开放，自己使用
    private static DataSource getDataSource(){
        if (DATA_SOURCE==null){
            synchronized (DBUtil.class){
                if (DATA_SOURCE==null){
                    DATA_SOURCE=new MysqlDataSource();
                    ((MysqlDataSource)DATA_SOURCE).setUrl(URL);
                    ((MysqlDataSource)DATA_SOURCE).setUser(USERNAME);
                    ((MysqlDataSource)DATA_SOURCE).setPassword(PASSWORD);

                }
            }
        }
        return DATA_SOURCE;
    }
    //获取数据库连接：提供公共的方法给其他地方操作JDBC是啥获取数据库连接
    public static Connection getConnection(){
        try {
            return getDataSource().getConnection();
        } catch (SQLException e) {
            throw new RuntimeException("获得数据库连接失败",e);
        }
    }
    public static void close(Connection c, Statement s, ResultSet r){
        try {
            if (r!=null){
                r.close();
            }
            if (s!=null){
                s.close();
            }
            if (c!=null){
                c.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("关闭数据库连接失败",e);
        }
    }
    public static void close(Connection c, Statement s){
        close(c,s,null);
    }
    }
