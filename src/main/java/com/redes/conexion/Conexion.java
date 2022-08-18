
package com.redes.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection getConnection() throws SQLException{
        String url="jdbc:mysql://localhost:3306/react?useSSL=false&allowPublicKeyRetrieval=true";
        return DriverManager.getConnection(url, "root","2450397381");
    }
    
}
