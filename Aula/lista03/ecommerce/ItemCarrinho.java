package lista03.ecommerce;

public class ItemCarrinho {
    private int cod;
    private float valor;
    private int qtde;
 

    public ItemCarrinho() {
    }

    public ItemCarrinho(int cod, float valor, int qtde) {
        this.setCod(cod);
        this.setValor(valor);
        this.setQtde(qtde);
    }
  
    //getters
    public int getCod() {
        return cod;
    }    

    public float getValor() {
        return valor;
    }
  
    public int getQtde() {
        return qtde;
    }


    //setters
    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    

    public String toString(){
        return "Código: " + this.cod + ", Valor: " + this.valor + ", Quantidade: " + this.qtde;
    }

}
