package practicafinaldein;

import javax.swing.JFrame;

/**
 * @date 11 feb. 2022
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class LlamadaDeClases {
    
    public void elegirCategoria(JFrame clase) {
        ElegirCategoriaPantalla elegirCategoria = new ElegirCategoriaPantalla();
        CarnetBPantalla.opcionElegidaB.clear();
        elegirCategoria.setVisible(true);
        clase.setVisible(false);
    }
    
    public void aprobadoPantallaA(JFrame clase) {
        AprobadoPantallaA aprobado = new AprobadoPantallaA();
        aprobado.setVisible(true);
        clase.setVisible(false);
    }
    
    public void aprobadoPantallaB(JFrame clase) {
        AprobadoPantallaB aprobado = new AprobadoPantallaB();
        aprobado.setVisible(true);
        clase.setVisible(false);
    }
    
    public void carnetAPantalla(JFrame clase) {
        CarnetAPantalla carnetA = new CarnetAPantalla();
        carnetA.setVisible(true);
        clase.setVisible(false);
    }
    
    

}
