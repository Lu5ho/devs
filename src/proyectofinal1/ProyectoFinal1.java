
package proyectofinal1;

import javax.swing.UIManager;
import vista.frmInventario;
import vista.frmLoginn;


public class ProyectoFinal1 {

   
    public static void main(String[] args) {
       
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        frmLoginn objlog =  new frmLoginn();
        objlog.setVisible(true);
        
        frmInventario objInvent =  new frmInventario();
        objInvent.setVisible(true);
        
        
        
    }
    
}
