/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guilherme
 */
public class Televisao {
    
    String energia;
    int volume;
    int canal;
    
    void ligar(){
        energia = "Ligada";  
    }
    void desligar(){
        energia = "Desligada";
    }
    void canalEspecifico(int x){
        canal = x;
    }
    void canalAnterior(){
        canal--;
    }
    void canalPosterior(){
        canal++;
    }
    void Silenciar(){
        volume = 0;
    }
    void mudarVolume(int x){
        volume = x;
    }
    void estado(){
        System.out.println("Energia: " + energia);
        System.out.println("Canal: " + canal);
        if (volume == 0){
            System.out.println("Volume: Modo Silencioso");
        }
        else{
            System.out.println("Volume: " + volume);
        }
        
    }
}

