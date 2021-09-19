package lista04.imobiliaria;

public class Casa extends Moradia {

    private float tamQuintal;
    private boolean piscina;

    public Casa() {
        super();
    }
    public Casa(String endereco, String cidade, float tamanho, float tamQuintal, boolean piscina) {
        super(endereco, cidade, tamanho);
        this.tamQuintal = tamQuintal;
        this.piscina = piscina;
    }

    public float getTamQuintal() {
        return tamQuintal;
    }
    public boolean isPiscina() {
        return piscina;
    }

    public void setTamQuintal(float tamQuintal) {
        this.tamQuintal = tamQuintal;
    }
    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }
    

    @Override
    public String toString(){
        return "Tamanho do Quinta: " + this.tamQuintal + " A casa tem piscina:" + this.piscina + super.toString();
    }

    @Override
    public void calcularPreco() {
        float m2 = 500;
        float aux = (this.tamanho*m2)+(this.tamQuintal*100);
        if (this.piscina){
            aux = aux + 1000;
        } 
        System.out.println(" Valor da casa é de:" + aux);
    }

    
}
