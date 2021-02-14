/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balıkoyunu;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author furkan
 */

public class Oyun extends JPanel implements KeyListener,ActionListener{
    Timer timer=new Timer(5, this);
    private int uzaybalıkx=730;
    private int dirbalıkx=20;
     private int uzaybalıky=300;
    private int dirbalıky=20;
    private int topx=0;
    private int topxdir=8;
    
                    
    private BufferedImage image;
    private BufferedImage iii;
    public  boolean kazan(){
        if (new Rectangle(uzaybalıkx,uzaybalıky,image.getWidth()/5,image.getHeight()/5).intersects(new Rectangle(0, 310, 5, 80))) {
        return true;
            }
        return false;
    }
    public boolean kontrolet(){
        if (new Rectangle(uzaybalıkx,uzaybalıky,image.getWidth()/5,image.getHeight()/5).intersects(new Rectangle(610,topx,20,20))) {
        return true;
            }
        if (new Rectangle(uzaybalıkx,uzaybalıky,image.getWidth()/5,image.getHeight()/5).intersects(new Rectangle(510,topx,20,20))) {
        return true;
            }
        if (new Rectangle(uzaybalıkx,uzaybalıky,image.getWidth()/5,image.getHeight()/5).intersects(new Rectangle(410,topx,20,20))) {
        return true;
            }
        if (new Rectangle(uzaybalıkx,uzaybalıky,image.getWidth()/5,image.getHeight()/5).intersects(new Rectangle(310,topx,20,20))) {
        return true;
            }
        if (new Rectangle(uzaybalıkx,uzaybalıky,image.getWidth()/5,image.getHeight()/5).intersects(new Rectangle(210,topx,20,20))) {
        return true;
            }
   
        
            if (new Rectangle(uzaybalıkx,uzaybalıky,image.getWidth()/5,image.getHeight()/5).intersects(new Rectangle(110,topx,20,20))) {
        return true;
            }
        if (new Rectangle(uzaybalıkx,uzaybalıky,image.getWidth()/5,image.getHeight()/5).intersects(new Rectangle(0,topx,20,20))) {
            return true;
            
        
        }
        if (new Rectangle(uzaybalıkx,uzaybalıky,image.getWidth()/5,image.getHeight()/5).intersects(new Rectangle(85, 60, 30, 100))) {
        return true;
            }
        if (new Rectangle(uzaybalıkx,uzaybalıky,image.getWidth()/5,image.getHeight()/5).intersects(new Rectangle(350, 160, 30, 100))) {
        return true;
            }
        if (new Rectangle(uzaybalıkx,uzaybalıky,image.getWidth()/5,image.getHeight()/5).intersects(new Rectangle(250, 260, 30, 100))) {
        return true;
            }
        if (new Rectangle(uzaybalıkx,uzaybalıky,image.getWidth()/5,image.getHeight()/5).intersects(new Rectangle(150, 360, 30, 100))) {
        return true;
            }
        if (new Rectangle(uzaybalıkx,uzaybalıky,image.getWidth()/5,image.getHeight()/5).intersects(new Rectangle(450, 460, 30, 100))) {
        return true;
            }
        if (new Rectangle(uzaybalıkx,uzaybalıky,image.getWidth()/5,image.getHeight()/5).intersects(new Rectangle(550, 60, 30, 100))) {
        return true;
            }
         if (new Rectangle(uzaybalıkx,uzaybalıky,image.getWidth()/5,image.getHeight()/5).intersects(new Rectangle(650, 270, 30, 100))) {
        return true;
            }
        
    

 

        return false;
    }

    public Oyun(BufferedImage image) {
        this.image = image;
    }
    public  Oyun(){
        try {
            image =ImageIO.read(new FileImageInputStream(new File("indir.jpg")));
        } catch (IOException ex) {
            Logger.getLogger(Oyun.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            iii=ImageIO.read(new FileImageInputStream(new File("C:\\Users\\furkan\\Desktop\\1027285453.jpg")));
        } catch (IOException ex) {
            Logger.getLogger(Oyun.class.getName()).log(Level.SEVERE, null, ex);
        }
        setBackground(Color.blue);
        
        timer.start();
        
    }

    @Override
    public void paint(Graphics grphcs) {
        
        super.paint(grphcs); //To change body of generated methods, choose Tools | Templates.
        
        grphcs.setColor(Color.red);
        grphcs.fillOval(0, topx, 20, 20);
        grphcs.fillOval(110, topx, 20, 20);
        grphcs.fillOval(210, topx, 20, 20);
        grphcs.fillOval(310, topx, 20, 20);
        grphcs.fillOval(410, topx, 20, 20);
        grphcs.fillOval(510, topx, 20, 20);
        grphcs.fillOval(610, topx, 20, 20);
        grphcs.setColor(Color.black);
        grphcs.fillRect(85, 60, 30, 100);
          grphcs.fillRect(350, 160, 30, 100);
            grphcs.fillRect(250, 260, 30, 100);
              grphcs.fillRect(150, 360, 30, 100);
                grphcs.fillRect(450, 460, 30, 100);
                 grphcs.fillRect(550, 60, 30, 100);
                  grphcs.fillRect(650, 270, 30, 100);
                  grphcs.setColor(Color.yellow);
                  grphcs.drawRect(0, 310, 5, 80);
        
        grphcs.drawImage(image,uzaybalıkx , uzaybalıky,image.getWidth()/5,image.getHeight()/5, this);
     
        
        if (kontrolet()==true) {
            timer.stop();
            String message="Kybettiniz tekrar deneyiniz";
                    
            JOptionPane.showMessageDialog(this, message);
            
        
    }
        if(kazan()==true){
            timer.stop();
            String messega="Kazandınız tebrikler";
            JOptionPane.showMessageDialog(this, messega);
            System.exit(0);
        }
    }
    @Override
    public void repaint() {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int c=ke.getKeyCode();
        if (c==KeyEvent.VK_LEFT) {
            if (uzaybalıkx<=0) {
                uzaybalıkx=0;
                
                
            }
            else{
                uzaybalıkx-=dirbalıkx;
            }
        }else  if (c==KeyEvent.VK_RIGHT) {
                    if (uzaybalıkx>=730) {
                    uzaybalıkx=730;
                    

}
                    else{
                    uzaybalıkx+=dirbalıkx;
                    }

}
        else if (c==KeyEvent.VK_DOWN ) {
            if (uzaybalıky>=530) {
                uzaybalıky=530;
                
                
            }
            else{
                uzaybalıky+=dirbalıky;
            }
           
           
        }
        else if(c==KeyEvent.VK_UP){
            if (uzaybalıky<=0) {
                uzaybalıky=0;
                
            }
            else{
                uzaybalıky-=dirbalıky;
            }
            
        }
            
        }

        
    

    @Override
    public void keyReleased(KeyEvent ke) {
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         topx +=topxdir;
        if (topx >=750) {
            topxdir= -topxdir;
            
            
        }
        if (topx<=0) {
            topxdir= - topxdir;
            
        }
         repaint();
    }
    
    
}
