package lista03.agregacao.viagem;
import java.util.Date; 

public class Voo {

    private int numero;
    private String origem;
    private String destino;
    private Date date;
    
    //Construtor sem parâmetro
    public Voo() {
    }

    //construtor com parâmetro
    public Voo(int numero, String origem, String destino, Date date) {
        this.setNumero(numero);
        this.setOrigem(origem);
        this.setDestino(destino);
        this.setDate(date);
    }


    //getters
    public int getNumero() {
        return numero;
    }

    public String getOrigem() {
        return origem;
    }
    
    public String getDestino() {
        return destino;
    }
    
    public Date getDate() {
        return date;
    }
   
    
    // setters
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    
    public void setDestino(String destino) {
        this.destino = destino;
    } 

    public void setDate(Date date) {
        this.date = date;
    }
    
    public String toString(){
        return "Número: " + this.numero + ", Origem: " + this.origem + ", Destino" + this.destino + ", Data: " + this.date;
    }
}
