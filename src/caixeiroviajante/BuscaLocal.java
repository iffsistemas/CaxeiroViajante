/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixeiroviajante;

import java.util.Random;

/**
 *
 * @author tarcisio
 */

public class BuscaLocal {
    private int[] rota;
    private double [][]distancias;
    private int qtde;

    public BuscaLocal(double[][] distancias, int qtde) {
        this.distancias = distancias;
        this.qtde = qtde;
        this.rota= new int[qtde];
        gerar_rota_inicial_aleatoria();
        
        for (int i=0;i<this.qtde;i++){
            System.out.print(""+this.rota[i]+"-");
        }
        
        System.out.println("\nCusto Total = " + custo_rota(this.rota));
    }
    
    
    private double custo_rota(int[] rota_testada){
        double custo =0.0;
        int i, de , para;
        
        for (i=0;  i<this.qtde-1; i++){
            de=rota_testada[i];
            para=rota_testada[i+1];
            
            custo+= this.distancias[de][para];
                                 
        }
        //Voltando para a cidade de origem
        
        custo+=this.distancias[i][0];
        return custo;
                
    }
    
    
    private void gerar_rota_inicial_aleatoria(){
        //Esvaziando o vetor
        for (int i=0;i<this.qtde;i++){
            this.rota[i]=-1;
        }
        
        Random r = new Random();
        int aux=0, i=0;
        while (i<this.qtde){
            aux=r.nextInt(this.qtde);
            if (!existe(aux)){
                this.rota[i]=aux;
                i++;
            }
        }
    }
    private boolean existe(int cidade){
        boolean retorno=false;
        for (int i=0;i<this.qtde;i++){
            if (cidade==this.rota[i]){
                retorno=true;
                break;
            }
        }
        return retorno;
    }
    
}
