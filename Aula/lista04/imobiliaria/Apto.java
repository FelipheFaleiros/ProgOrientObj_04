package lista04.imobiliaria;

public class Apto extends Moradia {

    private int nro;
    private int andar;

    public Apto() {
        super();
    }
    public Apto(String endereco, String cidade, float tamanho, int nro, int andar) {
		super(endereco, cidade, tamanho);
		this.nro = nro;
		this.andar = andar;
	}

	public int getAndar() {
        return andar;
    }
    public int getNro() {
        return nro;
    }
    public void setNro(int nro) {
        this.nro = nro;
    }
    public void setAndar(int andar) {
        this.andar = andar;
    }

    @Override 
    public String toString(){
        return "Número do Apartamento:" + this.nro + " Andar:" + this.andar + super.toString();
    }

    @Override
    public void calcularPreco() {
        float m2 = 800;
        float aux = this.tamanho*m2;
        if (this.nro % 2 ==0){ //saber se o nro é par
            aux = aux + 200;
        }
        else{
            aux = aux + 300;
        }
        if (this.andar >= 3){
            aux = aux + 2000;
        } 
        System.out.println(" Valor do Apartamento é de:" + aux);
    }
    
}
