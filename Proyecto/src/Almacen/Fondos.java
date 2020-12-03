
package Almacen;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Fondos extends javax.swing.JPanel{
   public Fondos (){
       this.setSize(486, 420);
   } 
   
   public void paintComponent (Graphics g){
       ImageIcon imageFondo = new ImageIcon(getClass().getResource("/Imagenes/logo.png")); 
       g.drawImage(imageFondo.getImage(), 0, 0, 486, 420, null);    
       setOpaque(false);
       super.paintComponent(g);
   }
}
