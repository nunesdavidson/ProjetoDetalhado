/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.Calendar;

/**
 *
 * @author Davidson
 */
public class Venda {
    private float preco=0;
    private float valorTotal=0;
    private Calendar dia;
    private float caixaDia;
    
    //Metodos alunos
    public void setPreco(float novo){
               
        if(this.preco<=0){
            System.out.println("Preco Inválido");
        }
        else{
            preco=novo;
            System.out.println("O novo valor do ticket de Aluno e: "+ preco+" .");
        }
    }
    public float getPreco(){
        return preco;
    }
    
    
    // tratar exceção
    public float qtdTick(int qtd)  {
        if ((qtd<5)&&(qtd%5!=0)){//no RU só se vendem pacotes com 5 ou 10 unidades. 
            System.out.println("\nVenda não permitida, quantidade incorreta. Um pacote possui 5 tickets.\n");           
        }
        else{
            valorTotal=qtd*preco;
            System.out.println(preco); 
            this.calCaixa(valorTotal);
        }return valorTotal;
    }    
    
    //tratar exceção
    public float receberDin(float pagamento){
        float troco = 0;
        if (pagamento<valorTotal){
            System.out.println("Está faltando dinheiro.");
        }else{
            troco=pagamento-valorTotal;
            System.out.println("Troco:"+troco);
        }return troco;
    }
    
    public void calCaixa(float credito){
        caixaDia=caixaDia+credito;
    }
    
    //para saber o número do caixa
    public float set_caixaDia(){
        return caixaDia;
    }
   
}
