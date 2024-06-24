package conexao; // Código para integração com banco de dados

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String url = "jdbc:mysql://localhost:3306/projetojava";
    private static final String user = "root";
    private static final String password = "Nami4645@";

    public static Connection getConexao() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }



}
