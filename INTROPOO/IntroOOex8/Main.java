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
        Celular celular = new Celular();
        celular.ligacao(20);
        celular.mensagem();
        celular.mensagem();
        celular.ligacao(30);
        celular.mostrarBateria();
    }
}
