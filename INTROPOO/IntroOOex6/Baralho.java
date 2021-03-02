/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guilherme
 */
public class Baralho {
    
    Carta[][] baralho = new Carta[4][13];

    void montarBaralho(){
        
        String[] naipe = new String[4];
        naipe[0] = "copas";
        naipe[1] = "espadas";
        naipe[2] = "ouros";
        naipe[3] = "paus";
        
        String[] valor = new String[13];
        valor[0] = "ás";
        valor[1] = "dois";
        valor[2] = "tres";
        valor[3] = "quatro";
        valor[4] = "cinco";
        valor[5] = "seis";
        valor[6] = "sete";
        valor[7] = "oito";
        valor[8] = "nove";
        valor[9] = "dez";
        valor[10] = "valete";
        valor[11] = "dama";
        valor[12] = "rei";
        
        for(int i = 0; i < 4; i ++){
            for(int j = 0; j < 13; j++){
                baralho[i][j] = new Carta();
                baralho[i][j].naipe = naipe[i];
                baralho[i][j].valor = valor[j];
                
            }
            
        }
       
    }
    
    void mostraBaralho(){
        for(int i = 0; i < 4; i ++){
            for(int j = 0; j < 13; j++){
                System.out.println(baralho[i][j].valor + " de " + baralho[i][i].naipe + " ");
                
            }
                
        }
    }

}
