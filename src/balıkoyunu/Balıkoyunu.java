
package balıkoyunu;

import java.awt.HeadlessException;
import javax.swing.JFrame;


public class Balıkoyunu extends JFrame{
    

   public static void main(String[] args) {
       Balıkoyunu balık=new Balıkoyunu("balık oyunu");
       balık.setResizable(false);
       balık.setFocusable(false);
       balık.setSize(800,600);
       balık.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Oyun oyun=new Oyun();
       oyun.requestFocus();
       oyun.addKeyListener(oyun);
        oyun.setFocusable(true);
        oyun.setFocusTraversalKeysEnabled(false);
        balık.add(oyun);
        balık.setVisible(true);
       
              
       
    }

    public Balıkoyunu(String string) throws HeadlessException {
        super(string);
    }
    
}
