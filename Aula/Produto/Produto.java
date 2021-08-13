package Produto;

public class Produto {
    public int id, qtde;
    public String descricao;
    public float preco;

    //contrutor
    public Produto(){
        
    } 
     
    public Produto(int id, int qtde, String descricao, float preco){
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.preco = preco;
        
    }

    //comprar 
    public void comprar (int x){
        this.qtde += x;
    }

    //venda 
    public void venda (int x){
        this.qtde -= x;
    }

    //subir
    public void subir (float x){
        this.preco += x;
    }

    //descer 
    public void descer (float x){
        this.preco -= x;
    }

    public String mostra(){
        return String.format("Nome:  %s Qtd: %d Preço %.2f", this.descricao, this.qtde, this.preco);
    }

}
