/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guilherme
 */
public class Main {
    public static void main(String[] args){
        Casa casa = new Casa();
        casa.PintarCasa("amarelo");
                
        casa.porta1.abrir();
        casa.porta2.fechar();
        casa.porta3.abrir();
        
        casa.quantasPortasEstaoAbertas();
                
        
    }
}
