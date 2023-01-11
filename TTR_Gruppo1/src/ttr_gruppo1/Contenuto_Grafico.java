package ttr_gruppo1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Contenuto_Grafico extends JPanel implements ActionListener{

    private Timer timer;
    private final int DELAY = 10;

    public Contenuto_Grafico() {

        initBoard();
    }

    private void initBoard() {

       //addKeyListener(new TAdapter());
        setBackground(Color.black);
	setFocusable(true);

        //spaceShip = new SpaceShip();

        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);
        
        Toolkit.getDefaultToolkit().sync();
    }
    
    private BufferedImage loadImage(){
        URL imagePath = getClass().getResource("immagini/board.png");
        BufferedImage result = null;
        try {
            result = ImageIO.read(imagePath);
        } catch (IOException e) {
            System.err.println("Errore, immagine non trovata");
        }

        return result;
    }
    
    private void doDrawing(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(TTR_Gruppo1.mazzoObiettivi.getImage(), TTR_Gruppo1.mazzoObiettivi.getX(), 
            TTR_Gruppo1.mazzoObiettivi.getY(), this);
        
        g2d.drawImage(TTR_Gruppo1.mazzoTreni.getImage(), TTR_Gruppo1.mazzoTreni.getX(), 
            TTR_Gruppo1.mazzoTreni.getY(), this);
        
        g2d.drawImage(TTR_Gruppo1.mazzoTreni.getImage(), TTR_Gruppo1.mazzoTreni.getX(), 
            TTR_Gruppo1.mazzoTreni.getY(), this);
        
        g2d.drawImage(TTR_Gruppo1.mazzoTreni.getImage(), TTR_Gruppo1.mazzoTreni.getX(), 
            TTR_Gruppo1.mazzoTreni.getY(), this);
        g2d.drawImage(loadImage(),0,0,this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        step();
    }
    
    private void step() {
        
       /* spaceShip.move();
        
        repaint(spaceShip.getX()-1, spaceShip.getY()-1, 
                spaceShip.getWidth()+2, spaceShip.getHeight()+2);     */
    }    

    private class TAdapter extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            //spaceShip.keyReleased(e);
        }
    }
}