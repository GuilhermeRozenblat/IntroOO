/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guilherme
 */
public class Porta {
    
    String status;
    String cor;
    int altura;
    int largura;
    
    void abrir(){
        status = "aberta";
    }
    
    void fechar(){
        status = "fechada";
    }
    
    void pintar(String x){
        cor = x ;  
    }
    
    void estaAberta(){
        System.out.println("A porta está " + status);
    }
    
    void corPorta(){
        System.out.println("A cor da porta é " + cor);
    }
    
}
