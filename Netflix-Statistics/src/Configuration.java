import Database.SQLAccount;

import java.awt.*;

public class Configuration {
    //Name of your sql account, if configured via avans settings its SQLEXPRESS
    //If configured via default settings use MSSQLSERVER
    public final static SQLAccount  SQL_ACCOUNT= SQLAccount.SQLEXPRESS;

    //Name of the application
    public final static String appName = "Netflix statistix";

    //Name of our database
    public final static String databaseName = "Netflixstatistix";

    //Creators
    public final static String authors = "Informatica 1A - Martijn, Pawel, Stan";

    //Basic backgroundColor for the app
    public static Color backgroundColor = Color.decode("#EEEEEE");

    //Basic font for the app
    public final static String defaultFont = "Segoe UI";



}
