package lista03.composicao.venda_com_arraylist;

import java.util.Date;
import java.util.ArrayList;

public class Venda {
    private int codigo;
    private float valorTotal;
    private Date data;
    // ArrayList
    private ArrayList<ItemVenda> itens;
   
    //construtores
    public Venda() {
        this.itens = new ArrayList<ItemVenda>();
    }

    public Venda(int codigo, float valorTotal, Date data) {
        this.codigo = codigo;
        this.valorTotal = valorTotal;
        this.data = data;
        this.itens =  new ArrayList<ItemVenda>();
    }

    //getters
    public int getCodigo() {
        return codigo;
    }

    public ArrayList<ItemVenda> getItens() {
        return itens;
    }

    public Date getData() {
        return data;
    }
    
    public float getValorTotal() {
        return valorTotal;
    }
    
    //setters
    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }
   
    public void setData(Date data) {
        this.data = data;
    }
    
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    // adiciona um item de venda - composição
    public void addItemVenda(int codigo, String name, int qtde, float valor){
        // item venda depende de venda
        this.itens.add(new ItemVenda(codigo, name, qtde, valor));

    }
    public String toString(){
        return "Código: " + this.codigo + " Valor total: " + this.valorTotal + 
        " Data: " + this.data + " \n Itens da venda " + this.itens.toString(); 
    }
}
