package lista03.composicao.ecommerce;
import java.util.Date;

public class Carrinho {
    private int cod;
    private float valorTotal;  
    private String formaPgto;
    
   
    

    private Date date;
    private String formaEntrega;
    //associação 
    private ItemCarrinho itemCarrinho;
    
    
    public Carrinho() {

    }


    public Carrinho(int cod, float valorTotal, String formaPgto, Date date, String formaEntrega, int codIC, float valorIC, int qtdeIC) {
        this.cod = cod;
        this.valorTotal = valorTotal;
        this.formaPgto = formaPgto;
        this.date = date;
        this.formaEntrega = formaEntrega;
        this.itemCarrinho =  new ItemCarrinho(codIC, valorIC, qtdeIC); //composição
    }

       
    // getters
    public int getCod() {
        return cod;
    }

    public float getValorTotal() {
        return valorTotal;
    }
    
    public String getFormaPgto() {
        return formaPgto;
    }
    
    public Date getDate() {
        return date;
    }
    
    public ItemCarrinho getItemCarrinho() {
        return itemCarrinho;
    }

    public String getFormaEntrega() {
        return formaEntrega;
    }



   // setters
    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setFormaPgto(String formaPgto) {
        this.formaPgto = formaPgto;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public void setItemCarrinho(int codIC, float valorIC, int qtdeIC) {
        this.itemCarrinho = new ItemCarrinho (codIC, valorIC, qtdeIC); //composição
    }
   
    public void setFormaEntrega(String formaEntrega) {
        this.formaEntrega = formaEntrega;
    }

    public String toString(){
        return "Código: " + this.cod + ", Valor total: " + this.valorTotal + ", Pagamento: " + this.formaPgto + ", Data: " + this.date + ", Entrega: " + this.formaEntrega + "\n Item Carrinho: " + this.itemCarrinho.toString()  ;
    }


}
