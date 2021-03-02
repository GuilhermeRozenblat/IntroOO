/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guilherme
 */
public class Celular {
    
    int bateria = 100;
    
    void mensagem(){
        bateria -= 1;
        
    }
    void ligacao(int tempo){
        bateria -= tempo/5;
        
    }
    void mostrarBateria(){
        System.out.println(bateria);
    }
}
