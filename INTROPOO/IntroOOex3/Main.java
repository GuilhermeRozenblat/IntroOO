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
        Porta porta = new Porta();
        
        porta.abrir();
        porta.fechar();
        
        porta.pintar("verde");
        porta.pintar("azul");
        
        porta.altura = 2;
        porta.largura = 1;
        
        porta.estaAberta();
        porta.corPorta();
    }
}
