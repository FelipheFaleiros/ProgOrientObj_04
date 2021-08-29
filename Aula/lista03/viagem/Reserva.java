package lista03.viagem;
import java.util.Date;

public class Reserva {

    private int cod;    
    private Date date; 
    private Float valor;
    //associação
    private Passageiro passageiro; //Passageiro é a classe e passageiro é o objeto
    private Voo voo; //Voo é a classe e voo é o objeto



    //construtores
    //sem parâmetro 
    public Reserva() {
    }

    //com parâmetro
    public Reserva(int codigo, Date data, float valor, Passageiro passageiro, Voo voo) {
        this.setCod(codigo);
        this.setDate(data);
        this.setValor(valor);
        this.setPassageiro(passageiro);
        this.setVoo(voo);
    }

    //getters 
    public int getCod() {
        return cod;
    }

    public Date getDate() {
        return date;
    }
    
    public Float getValor() {
        return valor;
    }  
    
    public Passageiro getPassageiro() {
        return passageiro;
    }

    public Voo getVoo() {
        return voo;
    }


    //setters 
    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
    
    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    // toString() -> converter o passageiro em string
    public String toString() {
        return "Código: " + this.cod + ", Data: " + this.date + ", Valor: " + this.valor + "\n Passageiro: " + this.passageiro.toString() + "\n Voo: " + this.voo.toString();
    }

}

    

