package dbo;

public class ItemDBAccess extends DBAccess {
    final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    final String url =  "jdbc:sqlserver://127.0.0.1\\SQLEXPRESS:1433; databaseName=ManageDB; "
                + " user=sa; password=sa123456";
    public ItemDBAccess(){
        super();
        connectDB(driver, url);
    }
}
