package de.quoss.db2;

import java.sql.Connection;
import java.sql.DriverManager;

public class App {

    private void run() throws Exception {
        try (final Connection connection = DriverManager.getConnection("jdbc:db2://localhost:35581/db2inst1", "db2inst1", "db2inst1")) {
            
        }
    }
    
    public static void main(String[] args) throws Exception {
        new App().run();
    }
    
}
