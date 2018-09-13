/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixeiroviajante;

import java.util.Random;
import java.awt.Graphics;
import javax.swing.JPanel;


/**
 *
 * @author tarcisio
 */

public class Plotar extends JPanel{
    private int qtde, largura, altura;
    private int[][] coordenadas;
    private int[] rota;

    public Plotar(int qtde, int largura, int altura, int[] rota, int[][] coordenadas) {
        this.qtde = qtde;
        this.altura=altura;
        this.largura=largura;
        this.coordenadas= coordenadas;
        this.rota = rota;
            
    }
   
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int x, y, i;

        //Plotando todos os pontos gerados na tela
        for ( i=0;i<this.qtde;i++){
            x=this.coordenadas[i][0];
            y=this.coordenadas[i][1];
            g.fillOval(x, y, 7, 7);
            g.drawString("" + i, x, y);
        }
        //Traçando a rota na tela
        int x1, x2, y1, y2, de, para;
        
        for (i=0; i<this.qtde-1;i++){
            de=rota[i];
            para=rota[i+1];
            
        x1=this.coordenadas[de][0];
        y1=this.coordenadas[de][1];
        
        
        x2=this.coordenadas[para][0];
        y2=this.coordenadas[para][1];
                   
        
        g.drawLine(x1, y1, x2, y2);
         }
        
        //Voltando ao ponto de origem
        
         de=rota[i];
         para=rota[0];
            
        x1=this.coordenadas[de][0];
        y1=this.coordenadas[de][1];
        
        
        x2=this.coordenadas[para][0];
        y2=this.coordenadas[para][1];
                   
        
         g.drawLine(x1, y1, x2, y2);
        
  
        
    }
    

}
