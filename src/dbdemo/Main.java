package dbdemo;

// Importiere benötigte Klassen für JDBC
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        // JDBC-Verbindungsparameter
        String jdbcUrl = "jdbc:mysql://db:3306/testdb?useSSL=false&serverTimezone=UTC";
        String username = "user";
        String password = "password";

        // Erzeuge ein Objekt der Verbindungsklasse
        DatabaseConnector connector = new DatabaseConnector(jdbcUrl, username, password);

        // Führe die Datenbankabfrage durch
        connector.connectAndQuery();
    }
}
