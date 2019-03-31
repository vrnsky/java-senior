package me.vrnsky.patterns.Singleton;

public class DbConnection {

    private static DbConnection DB_CONNECTION = new DbConnection();

    private DbConnection() {
        //init db connection
    }

    public static DbConnection getInstance() {
        if (DB_CONNECTION == null) {
            DB_CONNECTION = new DbConnection();
        }
        return DB_CONNECTION;
    }
}
