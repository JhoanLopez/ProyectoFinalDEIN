package practicafinaldein;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @date 2 feb. 2022
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class ConexionDDBB {
    
    public static void ConectarDBSQLITE () {
        Properties properties = new Properties();
        Connection conexion = null;
        
        try {
            properties.load(new FileInputStream(new File("properties.properties")));
            String url = properties.get("url").toString();
            try {
                conexion = DriverManager.getConnection(url); 
                String guion = "--------------------";
                System.out.println(guion + " CONECTADzO CON LA BASE DE DATOS " + guion);
            } catch (SQLException ex) {
                System.out.print("ERROR CONEXIÓN CON BASE DE DATOS: ");
                System.out.println(ex);
            } 
        } catch (FileNotFoundException ex) {
            System.out.print("ERROR: ");
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.print("ERROR: ");
            System.out.println(ex);
        } 
    } 
}
