package me.vrnsky.patterns.Singleton;

public class DbConnection {
    private static final Object LOCK = new Object();
    private static DbConnection DB_CONNECTION = new DbConnection();

    private DbConnection() {
        //init db connection
    }


    public static DbConnection getInstance() {
        synchronized (LOCK) {
            return getDbConnection();
        }
    }

    private static DbConnection getDbConnection() {
        if (DB_CONNECTION == null) {
            DB_CONNECTION = new DbConnection();
        }
        return DB_CONNECTION;
    }
}
