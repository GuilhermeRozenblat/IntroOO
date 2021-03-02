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
    
    int status;
    
    void abrir(){
        status = 1;
    }
    
    void fechar(){
        status = 0;
    }
    
}
