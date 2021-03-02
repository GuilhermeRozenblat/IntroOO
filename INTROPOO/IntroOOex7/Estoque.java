/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guilherme
 */
public class Estoque {
    
    Produto[] produtos = new Produto[5];
    int qtd;
    float preco;
    int i = 0;
    
    void adicionarEstoque(String nome, int qtd, float preco){
        
        produtos[i] = new Produto();
        produtos[i].nome = nome;
        produtos[i].qtd = qtd;
        produtos[i].preco = preco;
        i++;
    }
        
}
