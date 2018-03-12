/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elporvenir.dise;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Timer;


public class Logo extends javax.swing.JPanel {

    private Rectangle2D rectangle2D;
    private Timer tmMoverCirculos;
    private Timer tmCrearCirculos;
    private ArrayList<Shape>recsUP;
    private ArrayList<Shape>recsDOWN;
    private ArrayList<Shape>recsLEFT;
    private ArrayList<Shape>recsRIGHT;
    private Random rand;
    private AffineTransform transformRotacion;
    
    public Logo() {
        initComponents();
        setBackground(Color.black);
        recsUP = new ArrayList<>();
        recsDOWN = new ArrayList<>();
        recsLEFT = new ArrayList<>();
        recsRIGHT = new ArrayList<>();
        rand = new Random();
        transformRotacion = new AffineTransform();
        LlamarTimer();
        LlamarTimer2();
    }
    
    private void LlenarListas(){
          int nr = rand.nextInt(4);
             if(nr == 0 && recsUP.size() < 5)
                  recsUP.add(new Ellipse2D.Double(58+rand.nextInt(200),-5,5,5));
             else if(nr==1 && recsDOWN.size() < 5)
                  recsDOWN.add(new Ellipse2D.Double(rand.nextInt(258),121,5,5));
             else if(nr == 2 && recsLEFT.size() < 5)
                  recsLEFT.add(new Ellipse2D.Double(0,rand.nextInt(121),5,5));
             else if(nr == 3 && recsRIGHT.size() < 5)
                  recsRIGHT.add(new Ellipse2D.Double(258,rand.nextInt(100)+21,5,5));
             
             ResetearListas(recsUP);
             ResetearListas(recsDOWN);
             ResetearListas(recsLEFT);
             ResetearListas(recsRIGHT);
    }
    
    
    private void ResetearListas(ArrayList<Shape> lista){
    if(lista.size() >= 5)
        lista = new ArrayList<>();
    }
    
    private void LlamarTimer2(){
       tmMoverCirculos = new Timer(1,new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
                Mover();
           }
       });
       tmMoverCirculos.start();
    }
    private void LlamarTimer(){
       tmCrearCirculos = new Timer(1000,new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               LlenarListas();
           }
       });
       tmCrearCirculos.start();
    
    }
    
    
    private void Mover(){           
              MoverArray(recsUP,0,0);
              MoverArray(recsDOWN,258, 121);
              MoverArray(recsLEFT,0,121);
              MoverArray(recsRIGHT,258,0);
              repaint();
    } 
    private void MoverArray(ArrayList<Shape> shaps,int pivoteX,int pivoteY){
              if(shaps.size() > 0){
                  transformRotacion.setToRotation(Math.toRadians(.1),pivoteX,pivoteY);
               for(int i = 0;i<shaps.size();i++){
                if(shaps.get(i) != null)   
                    shaps.set(i,transformRotacion.createTransformedShape(shaps.get(i)));                
               }
              }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.white);
        pintaAster(g2);
        
        
    }    
     private void pintaAster(Graphics2D g2){
        for(int i = 0;i<recsUP.size();i++)
            g2.fill(recsUP.get(i));
        
        for(int i = 0;i<recsDOWN.size();i++)
            g2.fill(recsDOWN.get(i));
        
        for(int i = 0;i<recsLEFT.size();i++)
            g2.fill(recsLEFT.get(i));
        
        for(int i = 0;i<recsRIGHT.size();i++)
            g2.fill(recsRIGHT.get(i));    
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(258, 121));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
