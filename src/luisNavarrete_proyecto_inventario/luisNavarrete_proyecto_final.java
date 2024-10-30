
package luisNavarrete_proyecto_inventario;

import javax.swing.UIManager;
import vista.frmLoginn;


public class luisNavarrete_proyecto_final {

   
    public static void main(String[] args) {
       
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        frmLoginn objlog =  new frmLoginn();
        objlog.setVisible(true);     
    }
    
}
