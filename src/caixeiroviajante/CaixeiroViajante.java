/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixeiroviajante;

import javax.swing.JFrame;

/**
 *
 * @author tarcisio
 */
public class CaixeiroViajante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int largura=1200, altura=700, qtde=50;
        Pontos p = new Pontos(qtde, largura, altura);
        
       JFrame pto = new JFrame("Pontos gerados");
       pto.add(p); 
       
       pto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       pto.setSize(largura,altura);
       pto.setLocationRelativeTo(null);
       pto.setVisible(true);
       
       BuscaLocal bl = new BuscaLocal(p.getDistancias(),qtde);
        
    }
    
}