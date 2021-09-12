package lista03.composicao.venda_com_arraylist;


public class ItemVenda {
    private int codigo;
    private String name;
    private int qtde;
    private float valor;

    //construtores
    public ItemVenda() {
        
    }

    public ItemVenda (int codigo, String name, int qtde, float valor){
        this.codigo = codigo;
        this.name = name;
        this.qtde = qtde;
        this.valor = valor;       
    }

    //getters
    public int getCodigo() {
        return codigo;
    }

    public String getName(){
        return name;
    }

    public int getQtde(){
        return qtde;
    }

    public float getValor(){
        return valor;
    }

    //setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }  
    
    public void setName(String name) {
        this.name = name;
    }
      
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
   
    public void setValor(float valor) {
        this.valor = valor;
    }   
    
    //parte visual
    public String toString(){
        return "Código: " + this.codigo + " Nome: " + this.name + " Valor: " + this.valor + "\n Quantidade: " + this.qtde;
    }
}
