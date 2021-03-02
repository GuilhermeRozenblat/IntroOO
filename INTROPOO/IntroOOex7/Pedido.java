/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guilherme
 */
public class Pedido {
    
    Produto[] pedido = new Produto[50];
    String pagamento;
    int i = 0;
    float precoTotal = 0;
    
    void pedirItem(String prod, int qtd, Estoque estoque){
        
        pedido[i] = new Produto();
        pedido[i].nome = prod;
        pedido[i].qtd = qtd;
        
        for(int j = 0; j < 5;j++){
            if(pedido[i].nome.equals(estoque.produtos[j].nome)){
                estoque.produtos[j].qtd -= qtd;
                this.precoTotal += estoque.produtos[j].preco * qtd;
                        
            }
        }
        i++;
    }
}

