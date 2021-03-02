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
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Guilherme";
        pessoa.idade = 20;
              
        pessoa.aniversario();
        pessoa.aniversario();
        pessoa.aniversario();
        
        System.out.println("Nome: "+ pessoa.nome);
        System.out.println("Idade: "+ pessoa.idade);

    }
}
