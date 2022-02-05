package practicafinaldein;

import java.sql.Connection;

/**
 * @date 2 feb. 2022
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class Main {
    
    public static void main (String [] args) {   
        Connection conexion = ConexionDDBB.ConectarDBSQLITE();
    }
}
