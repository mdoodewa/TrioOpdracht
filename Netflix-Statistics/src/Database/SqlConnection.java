package Database;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;

public class SqlConnection {

    private Connection connection = null;

    public boolean connectDatabase(String connectionUrl){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            this.connection = DriverManager.getConnection(connectionUrl);
        }
        catch(Exception e)
        {
            System.out.println(e);
            connection=null;
            return false;
        }
        return true;
    }

    public void disconnectDatabase(){
        if(connection != null){
            try{
                connection.close();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            connection=null;
        }
    }
    /*
    Dont use for update and insert statements
     */
    public ResultSet executeSQL(String sql){
        ResultSet resultset = null;
        try
        {
            Statement statement = this.connection.createStatement();
            resultset = statement.executeQuery(sql);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return  resultset;
    }

    public boolean executeSqlNoResult(String sql){
        try
        {
            Statement statement = this.connection.createStatement();
            return  statement.execute(sql);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return false;
    }

    /*
    Use this for update, delete and insert statements
     */
    public void executeStatements(String sql){
        try{
            Statement statement = this.connection.createStatement();
            System.out.println(sql);
            statement.executeUpdate(sql);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public void insert(ArrayList<Object> values, String tableName){
        String sql = "INSERT INTO "+tableName+"\n";
        sql+= "VALUES (";
        int i = 0;
        for(Object o : values){
            if(o.toString() == null || o.toString().length()==0||o.toString().equals("")){ //making sure its empty or not
                sql+= "null";
            }else{
                sql += "'"+o.toString()+"'";
            }
            if(i < values.size() -1){
                sql+= ", ";
            }else{
                sql += ");";
            }
            i++;
        }
        executeStatements(sql);
    }


}
